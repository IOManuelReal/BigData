"Practice 2"  

// Assessment 1/Practica 1  
//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo  
def set1() {
    var c: Int = 15
    val Pi: Double = 3.141592653589793
    val radio = c/(2*Pi)
    println(radio)
}

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo  
def set2() {
    var numero: Int = 10
    val resultado = numero % 2
    if(resultado == 0){
        println("Es un numero primo")
    }
    else {
        println("No es un numero primo")
    }
}

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para  
//   imprimir "Estoy ecribiendo un tweet"
def set3() {    
    val bird = "tweet"
    val action = s"Estoy escribiendo un ${bird}"
    println(action)
}

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la  
//   secuencia "Luke"
def set4() {    
    val mensaje: String = "Hola Luke yo soy tu padre!"
    println(mensaje slice (5,9))
}

//5. Cual es la diferencia entre value y una variable en scala?  
def set5() {
    val valor = "Es un valor que una vez asignado no puede cambiar"
    var variable = "Se trata de una variable, por lo que puede cambiar las veces que sean necesario"
    println(valor)
    println(variable)
}

//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416  
def set6() {    
    val my_tup = (2, 4, 5, 1, 2, 3, 3.1416, 23)
    println(my_tup._7)
}