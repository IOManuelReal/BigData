import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorIndexer
import org.apache.spark.mllib.evaluation.MulticlassMetrics

val df = spark.read.format("csv").option("sep", ";").option("header", "true").option("inferSchema", "true").load("E:/Programas/Git/BigData/FinalProyect/bank-full.csv")

df.printSchema()

df.show(15)

//SVM
val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("indexedY").fit(df)
val indexed = labelIndexer.transform(df).drop("y").withColumnRenamed("indexedY", "label")
val vectorFeatures = (new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features"))
val featurestrans = vectorFeatures.transform(indexed)

val featureslabel = featurestrans.withColumnRenamed("y", "label")
val dataindexed = featureslabel.select("label","features")
dataindexed.show()
val labelindexer = new StringIndexer().setInputCol("label").setOutputCol("indexedlabel").fit(dataindexed)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedfeatures").setMaxCategories(4).fit(dataindexed)

val Array(training, test) = dataindexed.randomSplit(Array(0.7, 0.3), seed = 1234L)

val supportVM = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val modelSVM = supportVM.fit(training)
val predictions = modelSVM.transform(test)

val predictionAndLabels = predictions.select($"prediction",$"label").as[(Double,
Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Confusion matrix:")
println(metrics.confusionMatrix)
println("Accuracy: " + metrics.accuracy)
println(s"Test Error = ${(1.0 - metrics.accuracy)}")

//Logistic Regression
val seed = 5043
val Array(trainingData, testData) = dataindexed.randomSplit(Array(0.7, 0.3), seed)

val logisticRegression = new LogisticRegression().setMaxIter(100).setRegParam(0.02).setElasticNetParam(0.8)

val logisticRegressionModel = logisticRegression.fit(trainingData)

val predictionDf = logisticRegressionModel.transform(testData)

predictionDf.show(10)

val predictionAndLabels = predictionDf.select($"prediction",$"label").as[(Double,
Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Confusion matrix:")
println(metrics.confusionMatrix)
println("Accuracy: " + metrics.accuracy)
println(s"Test Error = ${(1.0 - metrics.accuracy)}")

//MLP
val labelIndexer = new StringIndexer().setInputCol("loan").setOutputCol("indexedLabel").fit(df)
val indexed = labelIndexer.transform(df).withColumnRenamed("indexedLabel", "label")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","previous")).setOutputCol("features")
val features = assembler.transform(indexed)

val splits = features.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = splits(0)
val test = splits(1)

val layers = Array[Int](4, 5, 4, 2)

val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

val model = trainer.fit(train)

val result = model.transform(test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
val error = 1 - evaluator.evaluate(predictionAndLabels)
println("Error: " + error)

result.select("poutcome","y","label","features","rawPrediction","probability","prediction").show()