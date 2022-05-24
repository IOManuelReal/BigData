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
> **Unidad:** 2
>
> **Titulo:**<br>
> Practica Evaluatoria
>
> **Alumnos**<br>
> Anahi Del Carmen Hernandez Pablo *18210486* <br>
> Manuel Angel Real Castro  *18212253*

# Examen 
## Instructions
> Desarrollar las siguientes instrucciones en Spark con el leguaje de programación Scala,
> utilizando solo la documentacion de la librería de Machine Learning Mllib de Spark y
> Google.

- ### Activity 1
> Cargar en un dataframe Iris.csv que se encuentra en
> https://github.com/jcromerohdz/iris, elaborar la liempieza de datos necesaria para ser
> procesado por el siguiente algoritmo (Importante, esta limpieza debe ser por
> medio de un script de Scala en Spark) . 
> 
> a. Utilice la librería Mllib de Spark el algoritmo de Machine Learning multilayer
> perceptron

Set the csv file with the optimal configuration. <br>
The header option is to set the first column of the file as the header of my dataframe. <br>
The inferSchema option, check all the rows of my table and infers the columns type of data. <br>

```js
val df = spark.read.format("csv")
  .option("header", "true")
  .option("inferSchema", "true")
  .load("C:/Users/GAMER/Desktop/iris.csv")
```
We import all the libraries that will allow us to use the algorithm with the Import command.

```js
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.StringIndexer
```

- ### Activity 2
> ¿Cuáles son los nombres de las columnas?

To know the names of the column we use the command `df.columns`

```js
df.columns

/* Output:
*  res1: Array[String] = Array(sepal_length, sepal_width, petal_length, petal_width, species)
*/
```

- ### Activity 3
> ¿Cómo es el esquema?

To know the schema of our frame we will use the command `df.printSchema()`

<p>
  <img src="/Images/EvaluatoryPractice/img1.jpg" />
</p>

- ### Activity 4
> Imprime las primeras 5 columnas.

To show the first 5 communes of the data frame we use the command `df.columns.take(5)`

```js
df.columns.take(5)

/* Output:
*  res1: Array[String] = Array(sepal_length, sepal_width, petal_length, petal_width, species)
*/
```

- ### Activity 5
> Usa el método describe() para aprender más sobre los datos del DataFrame.

to know and learn more about the Data Frame data we will use the `df.describe().show` command

<p>
  <img src="/Images/EvaluatoryPractice/img2.jpg" />
</p>

- ### Activity 6
> Haga la transformación pertinente para los datos categóricos los cuales serán
nuestras etiquetas a clasificar.

We create the "features" column based on the numerical data of our Data Frame.

```js
val cols = Array("sepal_length", "sepal_width", "petal_length", "petal_width")

val assembler = new VectorAssembler().setInputCols(cols).setOutputCol("features")

val featureDf = assembler.transform(df)
```

Then we create the “labels” column with the remaining column.

```js
val indexer = new StringIndexer().setInputCol("species").setOutputCol("label")

val labelDf = indexer.fit(featureDf).transform(featureDf)
```

- ### Activity 7
 > Construya el modelo de clasificación y explique su arquitectura.
 
Split de csv data in a 7:3 ratio for training and testing respectively. <br>
First make the Logistic Regression training model and then the final model. <br>

```js
val seed = 5043
val Array(trainingData, testData) = labelDf.randomSplit(Array(0.7, 0.3), seed)

val logisticRegression = new LogisticRegression()
  .setMaxIter(100)
  .setRegParam(0.02)
  .setElasticNetParam(0.8)

val logisticRegressionModel = logisticRegression.fit(trainingData)

val predictionDf = logisticRegressionModel.transform(testData)
```

- ### Activity 8
> Imprima los resultados del modelo

We display the model results using the `predictionDf.show(10)` command.

<p>
  <img src="/Images/EvaluatoryPractice/img3.jpg" />
</p>
<p> exam video </p>
<p> https://www.youtube.com/watch?v=9whLnjdFmdM  </p>

