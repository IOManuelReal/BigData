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
> **Unidad:** 4
>
> **Titulo:**<br>
> Proyecto Final
>
> **Alumnos**<br>
> Anahi Del Carmen Hernandez Pablo *18210486* <br>
> Manuel Angel Real Castro  *18212253*

[Video Explicativo](https://youtu.be/VQgevsnpu2Y)

# Indice
- [Introduction](#introduction)
- [Theoretical framework](#theoretical-framework)
  - [Support Vector Machines (SVM)](#support-vector-machines-svm)
  - [Decision tree classifiers](#decision-tree-classifiers)
  - [Logistic regression](#logistic-regression)
  - [Multilayer Perceptron](#multilayer-perceptron)
- [Implementation](#implementation)
  - [Use of Support Vector Machines (SVM)](#use-of-support-vector-machines-svm) 
  - [Using Decision Tree Classifiers](#using-decision-tree-classifiers)
  - [Using Logistic Regression](#using-logistic-regression)
  - [Use of Multilayer Perceptron](#use-of-multilayer-perceptron)
- [Results](#results) 
- [Conclusions](#conclusions)
- [Video](#video)
- [References](#references)

# Introduction
Within computer science, there are particular concepts that form the basis of it as well as its importance, in this case, algorithms are a fundamental part of computer science, it consists of a series of ordered steps that allow us to calculate or develop A homework. The algorithm is the basis of programming as we know it and this allows us to know how a code works long before writing it.

Taking this into account, algorithms are becoming more common, this is because it is becoming easier to solve problems with them, in addition to the fact that technology has generated an increase in the ability to develop more complex programs capable of solving problems of much faster and more efficient.

In recent years, the efficiency and adaptability of the algorithms has meant that they can be used in a common way in an infinity of areas, specifically for the area of ​​this project, the analysis of data sets.

Currently algorithms allow us to analyze massive amounts of data with a specific objective; either making predictions, making classifications or reviewing failures in them, even so, these algorithms must be disturbances for their correct operation, this is because they can have failures when it comes to achieving some of the objectives already mentioned.

In this project on Machine Learning Algorithms, their behavior, differences between different types of classification and compare them to verify the efficiency of each one.
<br>

# Theoretical framework
### Support Vector Machines (SVM)
Pattern classification is defined as the task of categorizing some object into one of given categories called classes, from a set of patterns associated with each object. We use the term "pattern" to denote a vector of data, x of dimension p, where x = (x1,...,xp) T, whose components xi are the measures of the characteristics of an object. These characteristics are the variables specified by the researcher, because they usually have an important weight in the results of the classification.

In general, there are two main classification approaches: supervised classification and unsupervised classification. Unsupervised classification is also frequently referred to as clustering. In this type of classification, the data is not labeled and we want to find groups in the data that are distinguished from each other based on characteristics. In supervised classification we have a set of test data, each of these consists of measurements on a set of variables and associated to each data a label that defines the class of the object.

Neural networks, decision trees and SVMs are supervised learning classifiers. Supervised learning methods employ a set of input-output pairs, these classifiers acquire a decision function that associates a class label within the given classes to a new data item.

In this Chapter the theoretical characteristics of the SVM for classification problems with two classes are defined. First, we define decision functions and their importance in generalizing, then we define hard-margin Support Vector Machines for linearly separable training data sets in the input space. Once this is done, we extend to the linearly non-separable case and it is necessary to translate the input data space into a highly dimensional feature space in order to linearly separate the feature space. **Canales, J. C. (2009, August 18)**.

<p align="center">
  <img src="/Images/FinalProyect/img1.jpg" />
</p><br>

### Decision tree classifiers
Decision trees are statistical algorithms or machine learning techniques that allow us to build predictive data analytics models for Big Data based on their classification according to certain characteristics or properties, or on regression through the relationship between different variables to predict the value of another.

In classification models we want to predict the value of a variable by classifying the information based on other variables (type, group membership...). For example, we want to predict which people will buy a certain product, by classifying between customers and non-customers, or which brands of laptops each person will buy by classifying between different brands. The values ​​to be predicted are predefined, that is, the results are defined in a set of possible values. **Lives. (2021, May 7)**.

In regression models, an attempt is made to predict the value of a variable based on other variables that are independent of each other. For example, we want to predict the sale price of the land based on variables such as its location, surface, distance to the beach, etc. The possible result is not part of a predefined set, but can take any possible value.

The decision tree is a structure that is made up of branches and nodes of different types:

The internal nodes represent each one of the characteristics or properties to consider to make a decision.
The branches represent the decision based on a certain condition (eg probability of occurrence).
The final nodes represent the result of the decision.

Decision trees are generally used in Big Data to predict the probability of achieving a certain result based on certain conditions (uncertainty). Typical examples of the use of this type of algorithm are:

Make estimates of insurance premiums to be charged to policyholders.
Predict whether a certain product should be offered to a person.

### Logistic regression
Logistic regression is a process of modeling the probability of a discrete outcome given an input variable. The most common logistic regression models a binary outcome; something that can take two values ​​like true/false, yes/no, etc.

Multi-country logistic regression can model scenarios where there are more than two possible discrete outcomes. Logistic regression is a useful analysis method for classification problems, where you are trying to determine whether a new sample best fits a category. Since aspects of cyber security are classification problems, such as attack detection, logistic regression is a useful analytical technique. **Edgar, T.W., & Manz, D.O. (2017)**.

Logistic regression, despite its name, is a classification model rather than a regression model. Logistic regression is a simpler and more efficient method for binary and linear classification problems. It is a classification model, which is very easy to perform and achieves very good performance with linearly separable classes. It is a widely used algorithm for classification in the industry.

The logistic regression model, like the Adaline and the perceptron, is a statistical method for binary classification that can be generalized to multiclass classification. **Subasi, A. (2020)**.

Logistic regression is another powerful supervised machine learning algorithm used for binary classification problems (when the goal is categorical). The best way to think of logistic regression is that it is linear regression but for classification problems. Logistic regression essentially uses a logistic function defined below to model a binary output variable.

The main difference between linear regression and logistic regression is that the range of logistic regression is limited between 0 and 1. Also, unlike linear regression, logistic regression does not require a linear relationship between input and output variables. . This is due to the application of a nonlinear logarithmic transformation to the odds ratio. **Belyadi, H., & Haghighat, A. (2021)**.
‌

### Multilayer Perceptron
The multilayer perceptron (Multilayer Perceptron or MLP) is an artificial neural network made up of three different layers: the input layer, the hidden layer and the output layer.

<p align="center">
  <img src="/Images/FinalProyect/img2.jpg" />
</p><br>

As its name suggests, the input layer is responsible for taking the data that will be processed by the classification system, while the output will allow us to see the results of it. Within the multilayer perceptron there are a number of hidden layers placed between the input and output, these layers are the processing force behind the classification system, which gives it its name.

As in most classification systems, data processing follows a forward order like the one in the previous image. The neurons are trained with the backpropagation learning algorithm, which constantly learns with the propagation of data, elaborating a solution based on the data obtained from previous simulations or the data to be processed. **Artificial intelligence. (2020, May 3)**.

The Multilayer algorithm was designed to approximate any continuous function as well as having the ability to solve nonlinearly separable problems. The main use cases of the Multilayer Perceptron are pattern classification, recognition, prediction and approximation. **Abirami, S., & Chitra, P. (2020)**. <br>

# Implementation
To carry out this project, Apache Spark was used with the Scala programming language, it was decided to use this FrameWork for its efficiency for Big Data.

### Use of Support Vector Machines (SVM)
The libraries that dealt with
<p>
  <img src="/Images/FinalProyect/img3.jpg" />
</p><br>

Here we use this code to minimize errors and import the dataframe.
<p>
  <img src="/Images/FinalProyect/img4.jpg" />
</p><br>

Load the CSV bank-full for the data
<p>
  <img src="/Images/FinalProyect/img5.jpg" />
</p><br>

Index the column "y", create a vector with the columns with numeric data and name it as features, use the assembler object to transform features
<p>
  <img src="/Images/FinalProyect/img6.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img7.jpg" />
</p><br>

Rename column "y" as label, Union of label and features like data Indexed, Create labelIndexer and feature Indexer for pipeline
<p>
  <img src="/Images/FinalProyect/img8.jpg" />
</p><br>

Training data as 70% and test data as 30%.
<p>
  <img src="/Images/FinalProyect/img9.jpg" />
</p><br>

Linear support vector machine object, fit of training data to model, transformation of test data for predictions.
<p>
  <img src="/Images/FinalProyect/img10.jpg" />
</p><br>

Obtaining metrics, confusion matrix, precision and test error.
<p>
  <img src="/Images/FinalProyect/img11.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img12.jpg" />
</p>

### Using Decision Tree Classifiers
For the decision tree we use these libraries
<p>
  <img src="/Images/FinalProyect/img13.jpg" />
</p><br>

Here we use this code to minimize errors and import the dataframe.
<p>
  <img src="/Images/FinalProyect/img14.jpg" />
</p><br>

In this part we transform the categorical data to numeric, it is also merged with the new data.
<p>
  <img src="/Images/FinalProyect/img15.jpg" />
</p><br>

Here we have the training model
<p>
  <img src="/Images/FinalProyect/img16.jpg" />
</p><br>

Convert indexed tags to original tags.
Chain of indexers and tree in a Pipeline.
Train the model, this also runs the indexers.
<p>
  <img src="/Images/FinalProyect/img17.jpg" />
</p><br>

predictions are made.
the first 5 rows are displayed.
<p>
  <img src="/Images/FinalProyect/img18.jpg" />
</p><br>

Select prediction, tag.
<p>
  <img src="/Images/FinalProyect/img19.jpg" />
</p><br>

Test errors and precision are calculated.
<p>
  <img src="/Images/FinalProyect/img20.jpg" />
</p>

### Using Logistic Regression

Logistic regression model execution code:
```js
val seed = 5043
val Array(trainingData, testData) = dataindexed.randomSplit(Array(0.7, 0.3), seed)

val logisticRegression = new LogisticRegression().setMaxIter(100).setRegParam(0.02).setElasticNetParam(0.8)

val logisticRegressionModel = logisticRegression.fit(trainingData)

val predictionDf = logisticRegressionModel.transform(testData)

predictionDf.show(10)
```

Exit:
<p>
  <img src="/Images/FinalProyect/img21.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img22.jpg" />
</p>

### Use of Multilayer Perceptron

Logistic regression model execution code:
```js


  

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

```
Exit:
<p>
  <img src="/Images/FinalProyect/img23.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img24.jpg" />
</p>


Cras rhoncus luctus nisl, non mollis nisi sodales in. Nulla purus ipsum, semper dictum ex vel, vehicula blandit dui. Fusce quis sapien nec eros euismod posuere. Morbi tempus massa sed maximus molestie. Praesent non eros felis. Donec ut ligula lectus. Nunc quis purus fringilla eros ultrices interdum eget eu lectus. Praesent vel posuere dui, a commodo elit. Proin a eros suscipit, interdum purus sed, convallis tellus. <br>

# Results 
Average algorithms


| **Algorithm**             | **Accuracy** | **Test Error** |
|---------------------------|:------------:|:--------------:|
| **SVM**                   | 0.883770     | 0.1190861      |
| **Decision Tree**         | 0.83809      | 0.16190        |
| **Logistic Regression**   | 0.891231     | 0.1087682      |
| **Multilayer perceptron** | 0.838981     | 0.161018       |
<br>

# Conclusions
Within the tests carried out with each of the classification systems, we obtained a result where the Logistic Regression algorithm obtained a higher value when compared to the results of the other algorithms.

As we can see, each algorithm has its advantages and disadvantages, so although we have a metric value obtained in this research, it is always good to take each of these systems into account when classifying data. Well, it can be more effective when it comes to obtaining more accurate data.

Each algorithm presented its differences and its own elements to understand, so as well as considering its efficiency, its operation must be known in detail in order to use it correctly, because incorrect use can lead to inconsistencies. when running classification systems. <br>


### Video
https://www.youtube.com/watch?v=VQgevsnpu2Y

# References
Canales, J. C. (2009, agosto 18). Clasificación de grandes conjuntos de datos vía Máquinas de Vectores Soporte y aplicaciones en sistemas biológicos. Cinvestav.mx. http://www.ctrl.cinvestav.mx/~yuw/pdf/DoTesJCC.pdf

Vive. (2021, mayo 7). Árboles de decisión: en qué consisten y aplicación en Big Data. UNIR. https://www.unir.net/ingenieria/revista/arboles-de-decision/

La simple explicación del concepto de retropropagación — Inteligencia Artificial. (2020, May 3). Retrieved June 7, 2022, from DATA SCIENCE website:
https://datascience.eu/es/inteligencia-artificial/como-funciona-el-algoritmo-de-retropropagacion/

Abirami, S., & Chitra, P. (2020). Energy-efficient edge based real-time healthcare support system. Advances in Computers, 339–368. https://doi.org/10.1016/bs.adcom.2019.09.007

Edgar, T. W., & Manz, D. O. (2017). Exploratory Study. Research Methods for Cyber Security, 95–130. https://doi.org/10.1016/b978-0-12-805349-2.00004-2

Subasi, A. (2020). Machine learning techniques. Practical Machine Learning for Data Analysis Using Python, 91–202. https://doi.org/10.1016/b978-0-12-821379-7.00003-5

Belyadi, H., & Haghighat, A. (2021). Supervised learning. Machine Learning Guide for Oil and Gas Using Python, 169–295. https://doi.org/10.1016/b978-0-12-821929-4.00004-4 <br>
