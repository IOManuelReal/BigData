<p align="center">
  <img src="/Images/Title.png" />
</p>

> # Tecnológico Nacional de México Instituto Tecnológico de Tijuana
>
>
> **Departamento de Sistemas y Computación Ingeniería en Sistemas Computacionales**
>
> **Semestre**<br>
> Enero-Junio 2022
>
> **Materia**<br>
> Datos Masivos
>
> **Docente**<br>
> JOSE CHRISTIAN ROMERO HERNANDEZ
>
> **Unidad:** 3
>
> **Titulo:**<br>
> Practica Evaluatoria
>
> **Alumnos**<br>
> Anahi Del Carmen Hernandez Pablo *18210486* <br>
> Manuel Angel Real Castro  *18212253*

# Examen 
## Instructions
> **Instrucciones: ** 
> Desarrolle las siguientes instrucciones en Spark con el lenguaje de programación Scala. 
> 
> **Objetivo:**
> El objetivo de este examen práctico es tratar de agrupar los clientes de regiones específicas de un distribuidor al mayoreo. Esto en 
> base a las ventas de algunas categorías de productos. 
> Las fuente de datos se encuentra en el repositorio: 
> https://github.com/jcromerohdz/BigData/blob/master/Spark_clustering/Wholesale%20customers%20data.csv 

- ### Activity 1
> Importar una simple sesión Spark. 


```js
import org.apache.spark.sql.SparkSession
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images01.png" />
</p>

- ### Activity 2
> Utilice las lineas de código para minimizar errores

```js
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images02.png" />
</p>

- ### Activity 3
> Cree una instancia de la sesión Spark

```js
val spark = SparkSession.builder.getOrCreate()
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images03.png" />
</p>


- ### Activity 4
> Importar la librería de Kmeans para el algoritmo de agrupamiento. 

```js
import org.apache.spark.ml.clustering.KMeans
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images04.png" />
</p>

- ### Activity 5
> Carga el dataset de Wholesale Customers Data 

```js
val dataset = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/52664/Desktop/Unit3/Wholesale customers data.csv")
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images05.png" />
</p>
- ### Activity 6
> Seleccione las siguientes columnas: Fresh, Milk, Grocery, Frozen, Detergents_Paper,
Delicassen y llamar a este conjunto feature_data

```js
val  feature_data  = dataset.select("Fresh","Milk","Grocery","Frozen","Detergents_Paper","Delicassen")
```
> <p align="center">
  <img src="/Images/EvaluatoryPractice/images06.png" />
</p>

- ### Activity 7
 > Importar Vector Assembler y Vector 
 
Import the library to make the "features" column contain the vector created earlier. <br>

```js
import org.apache.spark.ml.feature.VectorAssembler
```

- ### Activity 8
 > Crea un nuevo objeto Vector Assembler para las columnas de caracteristicas como un conjunto de entrada, recordando que no hay etiquetas
 
Import the library to make the "features" column contain the vector created earlier. <br>

```js
val assembler = new VectorAssembler().setInputCols(cols).setOutputCol("features")
```

- ### Activity 9
 > Utilice el objeto assembler para transformar feature_data
 
Add the column of "features" to our dataframe. <br>

```js
val featureDf = assembler.transform(df)
```

- ### Activity 10
 > Crear un modelo Kmeans con K=3
 
Define the KMeans set and fit the model in the dataframe. <br>

```js
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(featureDf)
```

- ### Activity 11
> Evalúe los grupos utilizando Within Set Sum of Squared Errors WSSSE e imprima los
centroides.

We evaluate the model with the group of WSSSE and print the results.

```js
val WSSSE = model.computeCost(featureDf)
println(s"Within Set Sum of Squared Errors = $WSSSE")

println("Cluster Centers: ")
model.clusterCenters.foreach(println)
```

<p>
  <img src="/Images/EvaluatoryPractice-U3/img1.JPG" />
</p>
