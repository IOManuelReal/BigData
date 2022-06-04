import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler

val df = spark.read.format("csv").option("sep", ";").option("header", "true").option("inferSchema", "true").load("E:/Programas/Git/BigData/FinalProyect/bank-full.csv")

df.printSchema()

df.show(15)