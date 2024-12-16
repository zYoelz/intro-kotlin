package EjerciciosAntiguos

fun main() {
    //vamos a calcular los primeros x primos
    //primero vamos a pedir el numero de primos que se quiere determinar
    // depues imprimimos los primos

    println("Cuantos primos quieres calcular")
    val n: Int
    n = readLine()!!.toInt()
    var primo: Int
    primo = 3
    when (n) {
        1 -> println("1")
        2 -> println("1 \n 2")
        else -> {
            println("1\n2")
            var i: Int
            i = 2
            while (i < n) {
                if (esprimo(primo) == true) {
                    println(primo)
                    primo += 2
                    i += 1
                } else {
                    primo += 2
                }

            }
        }
    }


}

fun esprimo(b: Int): Boolean {
    val mitad = b / 2.toInt()
//    for (i in 2..mitad) {
//        if (b % i == 0)
//            return false
//    }
//    return true
    var j: Int = 3
    if (b % 2 == 0) {
        return false
    }

    while (j < mitad) {
        if (b % j == 0) {
            return false
        }
        else{
            j+=2
        }
    }
    return true

}