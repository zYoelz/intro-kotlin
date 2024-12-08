package Utils


class Utiles {

    fun  crearStringArray(input: String?, delimiter: String = ","): Array<String>? {
        return input?.split(delimiter)?.map { it.replace("\\s+", "" )}?.toTypedArray()
    }

    fun  crearIntArray(input: String, delimiter: String = ","): Array<Int> {
        val inputNew =input.split(delimiter).map { it.replace("\\s+", "")}.map { it.toInt() }.toTypedArray()
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
}

