fun main() {
    println(
        "\n \nHola estas en los ejercicios de Arrays.\n" +
                "Hay 6 ejercicios y tendras que elejir cual desear ejecutar \n"
    )
    var i = 1
    while (i == 1) {
        var j: Int?
        j = menu()
        if (j == null) {
            println("\n\n\nNo as escrito un numero.\n¡¡Intentalo de nuevo!!")
            i = 1
        } else {

            if (j in 1..6) {
                println(
                    "Procedamos con el ejercicio $j\n" +
                            "Su enunciado es:\n${titulo(j)}\n\n" +
                            "---------------- Procedamos -----------------\n\n"
                )
                i=proceder(j)

            } else {
                println("Adios")
                i = 0
            }
        }
    }

}

fun menu(): Int? {

//    println(
//        "Elige un ejercicio escribiendo el numero correspondiente\n" +
//                "1 -> ${titulo(1)} \n" +
//                "2 -> ${titulo(2)} \n" +
//                "3 -> ${titulo(3)} \n" +
//                "4 -> ${titulo(4)} \n" +
//                "5 -> ${titulo(5)} \n" +
//                "6 -> ${titulo(6)} \n" +
//                "Cualquier otro numero para salir"
//    )
    println("Elige un ejercicio escribiendo el numero correspondiente\n")
    for (k in 1..6) {
        var t = k
        println("$t -> ${titulo(t)}")
    }
    val j = readLine()?.toIntOrNull()
    return j

}

fun titulo(i: Int): String {
    when (i) {
        1 -> return "Insertar un número en una posición designada"
        2 -> return "Confirma si existe un numero dentro del conjunto"
        3 -> return "¿Cuanto se repite el numero dado?"
        4 -> return "Ordena un conjunto de numeros"
        5 -> return "Añade un String al conjunto"
        6 -> return "Primero que falta "

    }
    return "error en indice de titulo"
}

fun proceder(j: Int):Int? {
    val indice = j
    when (indice) {

    }
    println("\n\n Escribe algo para otro ejercicio o 1 si quieres salir\n")
    val decision = readLine()?.toInt()
    var salida : Int
    if (decision != 1 ) {
        salida = 1
    } else {
        salida = 0
        }

    return salida
    
}




