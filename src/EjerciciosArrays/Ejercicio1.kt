package EjerciciosArrays

import Utils.Utiles

val utiles1 = Utiles()


object Ejercicio1 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se insertara un número dado en una posición designada.\n" +
                    "Devuelve el nuevo array o nool en caso de que no sea posible\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull()?:""
        if (numbersArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        val numbersArrayInt = utiles1.crearIntArray(numbersArray)

        println("La cadena es ${numbersArrayInt.contentToString()}\nAhora escribe la posicion ")
        val indice = readlnOrNull()?.toInt() ?: -1
        if ((indice < 0) || (indice > numbersArrayInt.size)) throw Exception("Indice no valido")

        println("Ahora escribe el numeron ")
        val numero = readlnOrNull()?.toInt()
        if (numero == null) throw Exception("Numero no valido")
        println("la posicion es $indice\n El numero a insertar es $numero")

        val numberslista = numbersArrayInt?.toMutableList()

        numberslista?.add(indice - 1, numero)

        println("La nueva lista ${numberslista?.toTypedArray().contentToString()}")


    }


}