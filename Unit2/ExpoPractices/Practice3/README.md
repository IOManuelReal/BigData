
#The libraries that will be used are shown   

```js
import org.apache.spark.ml.Pipeline  
import org.apache.spark.ml.evaluation.RegressionEvaluator  
import org.apache.spark.ml.feature.VectorIndexer  
import org.apache.spark.ml.regression.{RandomForestRegressionModel,  RandomForestRegressor}
```

#Load and parse the data file, converting it to a DataFrame.   
```js
val data = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt") 
```

Automatically identify categorical features, and index them.<br>
Set maxCategories so features with > 4 distinct values are treated as continuous.  
```js
val featureIndexer = new VectorIndexer()  
  .setInputCol("features")  
  .setOutputCol("indexedFeatures")   
  .setMaxCategories(4)  
  .fit(data)
```

Split the data into training and test sets (30% held out for testing).
```js
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))   

Train a RandomForest model.  
val rf = new RandomForestRegressor()  
  .setLabelCol("label")  
  .setFeaturesCol("indexedFeatures")    

#Chain indexer and forest in a Pipeline.  
val pipeline = new Pipeline()  
  .setStages(Array(featureIndexer, rf))  

#Train model. This also runs the indexer.   
val model = pipeline.fit(trainingData)    

#Make predictions.  
val predictions = model.transform(testData)
```

Select example rows to display. 
```js
predictions.select("prediction", "label", "features").show(5)
```

Select (prediction, true label) and compute test error. 
```js
val evaluator = new RegressionEvaluator()  
  .setLabelCol("label")   
  .setPredictionCol("prediction")   
  .setMetricName("rmse")  
val rmse = evaluator.evaluate(predictions)  
println(s"Root Mean Squared Error (RMSE) on test data = $rmse")  

val rfModel = model.stages(1).asInstanceOf[RandomForestRegressionModel]  
println(s"Learned regression forest model:\n ${rfModel.toDebugString}")  
```
