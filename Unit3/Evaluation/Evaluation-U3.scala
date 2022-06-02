//Inciso 1
import org.apache.spark.sql.SparkSession

//Inciso 2
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

//Inciso 3
val spark = SparkSession.builder().getOrCreate()

//Inciso 4
import org.apache.spark.ml.clustering.KMeans

//Inciso 5
val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("E:/Programas/Git/BigData/Unit3/Wholesale customers data.csv")

//Inciso 6
val cols = Array("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")

//Inciso 7
//Import the library to make the "features" column contain the vector created earlier
import org.apache.spark.ml.feature.VectorAssembler

//Inciso 8
//Create the assembler for "features"
val assembler = new VectorAssembler().setInputCols(cols).setOutputCol("features")

//Inciso 9
//Add the column of "features" to our dataframe
val featureDf = assembler.transform(df)

//Inciso 10
//Define the KMeans set and fit the model in the dataframe
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(featureDf)

//Inciso 11
//We evaluate the model with the group of WSSSE and print the results
val WSSSE = model.computeCost(featureDf)
println(s"Within Set Sum of Squared Errors = $WSSSE")

println("Cluster Centers: ")
model.clusterCenters.foreach(println)
