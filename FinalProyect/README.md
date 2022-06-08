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

Por si olvido la sintaxis de Markdown <https://www.markdownguide.org/basic-syntax/> <br>
Data Processing <https://medium.com/@crscardellino/procesando-datos-con-spark-ii-carga-y-limpieza-de-datos-b15896f38cd0>

# Indice
- [Introduccion](#introducción)
- [Marco teoríco](#marco-teórico)
  - [Máquinas de Vectores Soporte (SVM)](#m%C3%A1quinas-de-vectores-soporte-svm)
  - [Clasificadores de árboles de decisión](#clasificadores-de-%C3%A1rboles-de-decisi%C3%B3n)
  - [Regresión Logística](#regresi%C3%B3n-log%C3%ADstica)
  - [Perceptrón Multicapa](#perceptr%C3%B3n-multicapa)
- [Implementación](#implementación)
  - [Uso de Máquinas de Vectores Soporte (SVM)](#uso-de-m%C3%A1quinas-de-vectores-soporte-svm) 
  - [Uso de Clasificadores de árboles de decisión](#uso-de-clasificadores-de-%C3%A1rboles-de-decisi%C3%B3n)
  - [Uso de Regresión Logística](#uso-de-regresi%C3%B3n-log%C3%ADstica)
  - [Uso de Perceptrón Multicapa](#uso-de-perceptr%C3%B3n-multicapa)
- [Resultados](#resultados) 
- [Conclusiones](#conclusiones)
- [Referencias](#referencias)

# Introducción
Dentro de la informática, existen conceptos en particular que sientan la base de la misma al igual que su importancia, en este caso, los algoritmos son una parte fundamental de la informática, esta consiste de una serie de pasos ordenados que nos permiten calcular o desarrollar una tarea. El algoritmo es la base de la programación como la conocemos y esto nos permite saber el funcionamiento de un código mucho antes de escribirlo.

Teniendo en cuenta esto, los algoritmos son cada vez más comunes, esto debido a que cada vez es más fácil solucionar los problemas con estos, además de que la tecnología ha generado un aumento en la capacidad de desarrollar programas más complejos capaces de resolver problemas de manera mucho más rápida y eficiente.

En recientes años la eficiencia y adaptabilidad de los algoritmos ha hecho que puedan ser utilizados de manera común en una infinidad de áreas, específicamente para el área de este proyecto, el análisis de conjuntos de datos. 

Actualmente los algoritmos nos permiten analizar cantidades masivas de datos con un objetivo específico; ya sea elaborando predicciones, haciendo clasificaciones o revisando fallas en los mismos, aun así, estos algoritmos deben ser entrenados para su correcto funcionamiento, esto debido a que pueden llegar a tener fallas a la hora de hacer alguno de los objetivos ya mencionados.

En este proyecto sobre Algoritmos de Machine Learning, su comportamiento, diferencias entre distintos tipos de clasificación y compararlos para verificar la eficiencia de cada uno.
<br>

# Marco teórico
### Máquinas de Vectores Soporte (SVM)
La clasificación de patrones se define como la tarea de categorizar algún objeto dentro de una de las categorías dadas llamadas clases, a partir de un conjunto de patrones asociados a cada objeto. Usamos el término “patrón” para denotar un vector de datos, x de dimensión p, donde x = (x1,...,xp) T, cuyos componentes xi son las medidas de las características de un objeto. Estas características son las variables especificadas por el investigador, debido a que por lo regular tienen un peso importante en los resultados de la clasificación.

En general, existen dos enfoques principales de clasificación: clasificación supervisada y clasificación no supervisada. La clasificación no supervisada también es referida frecuentemente como agrupamiento. En este tipo de clasificación, los datos no son etiquetados y se desean encontrar grupos en los datos que se distingan unos de otros a partir de las características. En la clasificación supervisada tenemos un conjunto de datos de prueba, cada uno de estos consiste de medidas sobre un conjunto de variables y asociado a cada dato una etiqueta que define la clase del objeto.

Las redes neuronales, árboles de decisión y SVM son clasificadores de aprendizaje supervisado. Los métodos de aprendizaje supervisado emplean un conjunto de pares entrada-salida, estos clasificadores adquieren una función de decisión que asocia a un nuevo dato una etiqueta de clase dentro de las clases dadas.

En este Capítulo son definidas las características teóricas de las SVM para problemas de clasificación con dos clases. Primero, definimos las funciones decisión y su importancia al generalizar, después definimos las Máquinas de Vectores Soporte con margen duro, para conjuntos de datos de entrenamiento linealmente separables en el espacio de entrada. Una vez concluido esto, nos extendemos a el caso linealmente no separable y es necesario trasladar el espacio de datos de entrada a un espacio de características altamente dimensional con el propósito de separar linealmente el espacio de características. **Canales, J. C. (2009, agosto 18)**.

<p align="center">
  <img src="/Images/FinalProyect/img1.jpg" />
</p><br>

### Clasificadores de árboles de decisión
Los árboles de decisión son algoritmos estadísticos o técnicas de machine learning que nos permiten la construcción de modelos predictivos de analítica de datos para el Big Data basados en su clasificación según ciertas características o propiedades, o en la regresión mediante la relación entre distintas variables para predecir el valor de otra.

En los modelos de clasificación queremos predecir el valor de una variable mediante la clasificación de la información en función de otras variables (tipo, pertenencia a un grupo…). Por ejemplo, queremos pronosticar qué personas comprarán un determinado producto, clasificando entre clientes y no clientes, o qué marcas de portátiles comprará cada persona mediante la clasificación entre las distintas marcas. Los valores a predecir son predefinidos, es decir, los resultados están definidos en un conjunto de posibles valores. **Vive. (2021, mayo 7)**.

En los modelos de regresión se intenta predecir el valor de una variable en función de otras variables que son independientes entre sí. Por ejemplo, queremos predecir el precio de venta del terreno en función de variables como su localización, superficie, distancia a la playa, etc. El posible resultado no forma parte de un conjunto predefinido, sino que puede tomar cualquier posible valor.

El árbol de decisión es una estructura que está formada por ramas y nodos de distintos tipos:

Los nodos internos representan cada una de las características o propiedades a considerar para tomar una decisión.
Las ramas representan la decisión en función de una determinada condición (p. ej. probabilidad de ocurrencia).
Los nodos finales representan el resultado de la decisión.

Los árboles de decisión se emplean generalmente en Big Data para predecir la probabilidad de conseguir un determinado resultado en base a ciertas condiciones (incertidumbre). Ejemplos típicos de la utilización de este tipo de algoritmos son:

Hacer estimaciones de las primas de seguros a cobrar a los asegurados.
Predecir si se le debe ofrecer un determinado producto a una persona.

### Regresión Logística
La regresión logística es un proceso de modelado de la probabilidad de un resultado discreto dada una variable de entrada. La regresión logística más común modela un resultado binario; algo que puede tomar dos valores como verdadero/falso, sí/no, etc. 

La regresión logística multinacional puede modelar escenarios donde hay más de dos posibles resultados discretos. La regresión logística es un método de análisis útil para problemas de clasificación, en los que intenta determinar si una nueva muestra encaja mejor en una categoría. Dado que los aspectos de la seguridad cibernética son problemas de clasificación, como la detección de ataques, la regresión logística es una técnica analítica útil. **Edgar, T. W., & Manz, D. O. (2017)**.

La regresión logística, a pesar de su nombre, es un modelo de clasificación en lugar de un modelo de regresión. La regresión logística es un método simple y más eficiente para problemas de clasificación binaria y lineal. Es un modelo de clasificación, que es muy fácil de realizar y logra muy buen desempeño con clases linealmente separables. Es un algoritmo ampliamente empleado para la clasificación en la industria. 

El modelo de regresión logística, como el Adaline y el perceptrón, es un método estadístico para la clasificación binaria que se puede generalizar a la clasificación multiclase. **Subasi, A. (2020)**.

La regresión logística es otro potente algoritmo de aprendizaje automático supervisado que se utiliza para problemas de clasificación binaria (cuando el objetivo es categórico). La mejor manera de pensar en la regresión logística es que es una regresión lineal pero para problemas de clasificación. La regresión logística utiliza esencialmente una función logística definida a continuación para modelar una variable de salida binaria. 

La principal diferencia entre la regresión lineal y la regresión logística es que el rango de la regresión logística está limitado entre 0 y 1. Además, a diferencia de la regresión lineal, la regresión logística no requiere una relación lineal entre las variables de entrada y salida. Esto se debe a la aplicación de una transformación logarítmica no lineal a la razón de probabilidades. **Belyadi, H., & Haghighat, A. (2021)**. 
‌

### Perceptrón Multicapa
El perceptrón multicapa (Multilayer Perceptron o MLP) se trata de una red neuronal artificial conformada por tres capas distintas: La capa de entrada, la oculta y la capa de salida.

<p align="center">
  <img src="/Images/FinalProyect/img2.jpg" />
</p><br>

Como su nombre lo dice, la capa de entrada se encarga de tomar los datos que serán procesados por el sistema de clasificación, mientras que la salida nos permitirá ver los resultados de la misma. Dentro del perceptrón multicapa existe una cantidad de capas ocultas colocadas entre la entrada y salida, estas capas son la fuerza de procesamiento detrás del sistema de clasificación, mismas que le dan su nombre al mismo. 

Como en la mayoría de los sistemas de clasificación, el procesamiento de datos sigue un orden de avance como el de la imagen anterior. Las neuronas son entrenadas con el algoritmo de aprendizaje de retropropagación, el cual aprende constantemente con la propagación de datos elaborando una solución basándose en los datos obtenidos tanto de simulaciones anteriores o los datos a procesar. **Inteligencia Artificial. (2020, May 3)**.

El algoritmo Multicapa fue diseñado para aproximar cualquier función continua además de tener la capacidad de resolver problemas no linealmente separables. Los principales casos de uso del Perceptrón Multicapa son la clasificación, el reconocimiento, la predicción y la aproximación de patrones. **Abirami, S., & Chitra, P. (2020)**. <br>

# Implementación 
Para llevar a cabo este proyecto se utilizó Apache Spark con el lenguaje de programación Scala, se decidió utilizar este FrameWork por su eficiencia para Big Data.

### Uso de Máquinas de Vectores Soporte (SVM)
Se importaron las librerías que se ocuparan 
<p>
  <img src="/Images/FinalProyect/img3.jpg" />
</p><br>

Aquí usamos este código para minimizar los errores e importamos el dataframe.
<p>
  <img src="/Images/FinalProyect/img4.jpg" />
</p><br>

Cargar el CSV bank-full para los datos
<p>
  <img src="/Images/FinalProyect/img5.jpg" />
</p><br>

Indexar la columna "y", cree un vector con las columnas con datos numéricos y nombrarlo como características, use el objeto ensamblador para transformar características 
<p>
  <img src="/Images/FinalProyect/img6.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img7.jpg" />
</p><br>

Cambiar el nombre de la columna "y" como etiqueta, Unión de etiqueta y características como data Indexed, Creación de labelIndexer y feature Indexer para la canalización
<p>
  <img src="/Images/FinalProyect/img8.jpg" />
</p><br>

Datos de entrenamiento como 70% y datos de prueba como 30%.
<p>
  <img src="/Images/FinalProyect/img9.jpg" />
</p><br>

Objeto de máquina vectorial de soporte lineal, ajuste de los datos de entrenamiento en el modelo, transformación de los datos de prueba para las predicciones.
<p>
  <img src="/Images/FinalProyect/img10.jpg" />
</p><br>

Obtención de métricas, matriz de confusión, precisión y error de prueba.
<p>
  <img src="/Images/FinalProyect/img11.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img12.jpg" />
</p>

### Uso de Clasificadores de árboles de decisión
Para el árbol de decisiones utilizamos estas librerías
<p>
  <img src="/Images/FinalProyect/img13.jpg" />
</p><br>

Aquí usamos este código para minimizar los errores e importamos el dataframe.
<p>
  <img src="/Images/FinalProyect/img14.jpg" />
</p><br>

En esta parte transformamos los datos categóricos a numéricos, también se fusionó con los nuevos datos.
<p>
  <img src="/Images/FinalProyect/img15.jpg" />
</p><br>

Aquí tenemos el modelo de entrenamiento 
<p>
  <img src="/Images/FinalProyect/img16.jpg" />
</p><br>

Convierta las etiquetas indexadas en etiquetas originales.
Cadena de indexadores y árbol en un Pipeline.
Entrena el modelo, esto también ejecuta los indexadores.
<p>
  <img src="/Images/FinalProyect/img17.jpg" />
</p><br>

se realizan las predicciones.
se muestran las primeras 5 filas. 
<p>
  <img src="/Images/FinalProyect/img18.jpg" />
</p><br>

Seleccionar predicción, etiqueta.
<p>
  <img src="/Images/FinalProyect/img19.jpg" />
</p><br>

Se calculan los errores de prueba y la precisión.
<p>
  <img src="/Images/FinalProyect/img20.jpg" />
</p>

### Uso de Regresión Logística
Código de ejecución del modelo de regresión logística:
```js
val seed = 5043
val Array(trainingData, testData) = dataindexed.randomSplit(Array(0.7, 0.3), seed)

val logisticRegression = new LogisticRegression().setMaxIter(100).setRegParam(0.02).setElasticNetParam(0.8)

val logisticRegressionModel = logisticRegression.fit(trainingData)

val predictionDf = logisticRegressionModel.transform(testData)

predictionDf.show(10)
```

Salida:
<p>
  <img src="/Images/FinalProyect/img21.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img22.jpg" />
</p>

### Uso de Perceptrón Multicapa
Código de ejecución del modelo de regresión logística:
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

Salida:
<p>
  <img src="/Images/FinalProyect/img23.jpg" />
</p>
<p>
  <img src="/Images/FinalProyect/img24.jpg" />
</p>

Cras rhoncus luctus nisl, non mollis nisi sodales in. Nulla purus ipsum, semper dictum ex vel, vehicula blandit dui. Fusce quis sapien nec eros euismod posuere. Morbi tempus massa sed maximus molestie. Praesent non eros felis. Donec ut ligula lectus. Nunc quis purus fringilla eros ultrices interdum eget eu lectus. Praesent vel posuere dui, a commodo elit. Proin a eros suscipit, interdum purus sed, convallis tellus. <br>

# Resultados 
Average algorithms

| **Algorithm**             | **Accuracy** | **Test Error** |
|---------------------------|:------------:|:--------------:|
| **SVM**                   | 0.883770     | 0.1190861      |
| **Decision Tree**         | 0.83809      | 0.16190        |
| **Logistic Regression**   | 0.891231     | 0.1087682      |
| **Multilayer perceptron** | 0.838981     | 0.161018       |
<br>

# Conclusiones
Dentro de las pruebas realizadas con cada uno de los sistemas de clasificación, obtuvimos un resultado en donde el algoritmo de Regresión Logística obtuvo un valor más alto a la hora de compararlo con los resultados de los demás algoritmos.

Como podemos observar, cada algoritmo tiene sus ventajas y desventajas, por lo que aunque tenemos un valor métrico obtenido en esta investigación, siempre es bueno tomar en cuenta cada uno de estos sistemas a la hora de clasificar datos. Pues puede ser más eficaz a la hora de obtener datos más precisos.

Cada algoritmo presentó sus diferencias y sus propios elementos a comprender, por lo que al igual que considerar su eficiencia, se debe conocer a detalle el funcionamiento del mismo para poder hacer uso del mismo correctamente, debido a que el uso incorrecto puede llevar a inconsistencias a la hora de ejecutar los sistemas de clasificación. <br>

# Referencias 
Canales, J. C. (2009, agosto 18). Clasificación de grandes conjuntos de datos vía Máquinas de Vectores Soporte y aplicaciones en sistemas biológicos. Cinvestav.mx. http://www.ctrl.cinvestav.mx/~yuw/pdf/DoTesJCC.pdf

Vive. (2021, mayo 7). Árboles de decisión: en qué consisten y aplicación en Big Data. UNIR. https://www.unir.net/ingenieria/revista/arboles-de-decision/

La simple explicación del concepto de retropropagación — Inteligencia Artificial. (2020, May 3). Retrieved June 7, 2022, from DATA SCIENCE website:
https://datascience.eu/es/inteligencia-artificial/como-funciona-el-algoritmo-de-retropropagacion/

Abirami, S., & Chitra, P. (2020). Energy-efficient edge based real-time healthcare support system. Advances in Computers, 339–368. https://doi.org/10.1016/bs.adcom.2019.09.007

Edgar, T. W., & Manz, D. O. (2017). Exploratory Study. Research Methods for Cyber Security, 95–130. https://doi.org/10.1016/b978-0-12-805349-2.00004-2

Subasi, A. (2020). Machine learning techniques. Practical Machine Learning for Data Analysis Using Python, 91–202. https://doi.org/10.1016/b978-0-12-821379-7.00003-5

Belyadi, H., & Haghighat, A. (2021). Supervised learning. Machine Learning Guide for Oil and Gas Using Python, 169–295. https://doi.org/10.1016/b978-0-12-821929-4.00004-4 <br>
