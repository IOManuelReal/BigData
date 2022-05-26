// Load of "Netflix_2011_2016.csv" file
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

//Change the file address to the corresponding one in your computer 
val df = spark.read.option("header", "true").option("inferSchema", "true")csv("E:/Programas/Git/BigData/Evaluation/Netflix_2011_2016.csv")

df.printSchema()
// End of load

//1 1. Start a simple Spark session.

C:\Spark\spark-2.4.8-bin-hadoop2.7\bin\spark-shell
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()


//2  Load the Netflix Stock CSV file, have Spark infer the data types.
val data=spark.read.option("Header", "true").option("inferSchema", "true")csv("Netflix_2011_2016.csv")
val data =  spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/52664/Downloads/Netflix_2011_2016.csv")


//3 What are the column names?
data.columns

//4 How is the scheme?
data.printSchema()

//5Print the first 5 columns.
Data.columns.take(5)

//6Use describe() to learn about the DataFrame.
data.describe().show()

//7 - Create a new dataframe with a new column called "HV Ratio" which is the ratio that
//  exists between the price of the “High” column versus the “Volume” column of shares
//  traded for one day. Hint - is an operation
val df2 = df.withColumn("HV Ratio", df("High") / df("Volume"))

df2.describe().show()

//8 - Which day had the highest peak in the “Open” column?
df.orderBy($"Open".desc).show()

//9 - What is the meaning of the “Close” column in the context of financial information,
//explain it, there is no need to code anything?

//Es el momento donde se revisa y reducens los balances antes de que el ciclo contable cierre

//10 - What is the maximum and minimum of the “Volume” column?
df.select(max("Volume")).show()

df.select(min("Volume")).show()

//11 - With Scala/Spark Syntax $ answer the following:
import spark.implicits._
//a) How many days was the “Close” column less than $600?
df.filter($"Close"<600).count()

//b) What percentage of the time was the "High" column greater than $500?
(df.filter($"High">500).count()*1.0 / df.count()) * 100

//c) What is the Pearson correlation between the “High” column and the “Volume” column?
df.select(corr("High", "Volume")).show()

//d) What is the maximum of the “High” column per year?
val yeardf = df.withColumn("Year", year(df("Date")))
val yearmaxs = yeardf.select($"Year", $"High").groupBy("Year").max().show()

//e) What is the average of the “Close” column for each calendar month?
val monthdf = df.withColumn("Month",month(df("Date")))
val monthavgs = monthdf.select($"Month",$"Close").groupBy("Month").mean()
monthavgs.select($"Month",$"avg(Close)").show()

