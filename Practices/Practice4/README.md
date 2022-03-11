//Given the pseudocode of the Fibonacci sequence in the provided link, implement 
//Algorithm 1, Algorithm 2, Algorithm 3, Algorithm 4, Algorithm 5 with Scala
//Algorithm 1
def fib1(n : Int) : Int = {
    if(n < 2) {
        return n
    } else {
        return fib1(n - 1) + fib1 (n - 2)
    }
}

//Algorithm 2
def fib2(n : Int) : Double = {
    if(n < 2) {
        return n
    } else {
        var p = ((1 + math.sqrt(5)) / 2)
        var j = ((math.pow(p, n) - (math.pow((1 - p), n))) / (math.sqrt(5)))
        return j
    }
}

//Algorithm 3
def fib3(n : Int) : Int = {
    var a = 0
    var b = 1
    var c = 0
    var k = 0
    while (k < n){
        c = b + a
        a = b
        b = c
        k = k + 1
    }
    return a 
}

//Algorithm 4
def fib4(n : Int) : Int = {
    var a = 0
    var b = 1
    var k = 0
    while (k < n){
        b = b + a
        a = b - a
        k = k + 1
    }
    return b
}

//Algorithm 5
def fib5(n : Int) : Int = {
    if (n < 2){
        return n
    } else {
        var m = n + 1
        var arr = Array.range(0, m)
        arr(0) = 0
        arr(1) = 1
        for(k <- 2 to (n + 1) ){
            arr(k) = arr(k - 1) + arr(k - 2)
        }
        return arr(n)
    }
}
