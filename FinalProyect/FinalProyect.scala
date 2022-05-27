

val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("E:/Programas/Git/BigData/FinalProyect/bank-full.csv")