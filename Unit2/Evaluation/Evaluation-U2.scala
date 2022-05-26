import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

//Logistic Regresion Libs
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler


//Inciso 1
//Set the csv file with the optimal configuration
//The header option is to set the first column of the file as the header of my dataframe
//The inferSchema option, check all the rows of my table and infers the columns type of data
val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("C:/Users/GAMER/Desktop/iris.csv")

//Inciso 2
//Shows an array of the columns in my data frame
df.columns

//Inciso 3
//Prints each type of data of my columns 
df.printSchema()

//Inciso 4
//Take the first five columns of my table
df.columns.take(5)

//Inciso 5
//Get detailed values of all data frame
df.describe().show

//Inciso 6
//Set column "features"
//First we make an array of the numerical data of my file
//Convert that array in a column named features and then add that to the data frame
val cols = Array("sepal_length", "sepal_width", "petal_length", "petal_width")

val assembler = new VectorAssembler().setInputCols(cols).setOutputCol("features")

val featureDf = assembler.transform(df)

//Set column "label"
//Same process as the "features" column, this time with the remaining column only
val indexer = new StringIndexer().setInputCol("species").setOutputCol("label")

val labelDf = indexer.fit(featureDf).transform(featureDf)


//Inciso 7
//Split de csv data in a 7:3 ratio for training and testing respectively
//First make the Logistic Regression training model and then the final model
val seed = 5043
val Array(trainingData, testData) = labelDf.randomSplit(Array(0.7, 0.3), seed)

val logisticRegression = new LogisticRegression().setMaxIter(100).setRegParam(0.02).setElasticNetParam(0.8)

val logisticRegressionModel = logisticRegression.fit(trainingData)

val predictionDf = logisticRegressionModel.transform(testData)

//Inciso 8
//Show the trained Classification Model
predictionDf.show(10)


