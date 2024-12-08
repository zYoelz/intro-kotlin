package Utils


class Utiles {

    fun crearStringArray(input: String?, delimiter: String = ","): Array<String>? {
        return input?.split(delimiter)?.map { it.replace("\\s+", "") }?.toTypedArray()
    }

    fun crearIntArray(input: String, delimiter: String = ","): Array<Int> {
        val inputNew = input.split(delimiter).map { it.replace("\\s+", "") }.map { it.toInt() }.toTypedArray()
        return inputNew
    }

//    fun construirArray(input: String?, delimiter: String = ","): Array<T> {
//        return input?.split(delimiter)?.map { it.replace("\\s+", "") }?.toTypedArray() as Array<T>
//    }

    fun menu(tipo: String): Int? {

        println(tipo)
        for (k in 1..6) {
            val t = k
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

    fun proceder(j: Int): Int {
        val indice = j
        when (indice) {
            1 -> EjerciciosArrays.Ejercicio1.proceder()
            2 -> EjerciciosArrays.Ejercicio2.proceder()
            3 -> EjerciciosArrays.Ejercicio3.proceder()
            4 -> EjerciciosArrays.Ejercicio4.proceder()
//            5 -> EjerciciosArrays.Ejercicio5.proceder()
//            6 -> EjerciciosArrays.Ejercicio6.proceder()

        }
        println("\n\n Escribe algo para otro ejercicio o 1 si quieres salir\n")
        val decision = readLine()?.toInt()
        var salida: Int
        if (decision != 1) {
            salida = 1
        } else {
            salida = 0
        }

        return salida

    }
}

