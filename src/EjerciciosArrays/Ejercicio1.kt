package EjerciciosArrays

import Utils.Utiles
import kotlin.reflect.typeOf

val utiles = Utiles()


object Ejercicio1 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se insertara un número dado en una posición designada.\n" +
                    "Devuelve el nuevo array o nool en caso de que no sea posible\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull()
        if (numbersArray?.isEmpty() == true) throw Exception("Cadena Vacia")
        val numbersArrayLimpia = utiles.crearIntArray(numbersArray)


        println("La cadena es ${numbersArrayLimpia.contentToString()}\nAhora escribe la posicion ")
        val indice = readlnOrNull()?.toInt()?:-1
        if (indice < 0 || indice > numbersArrayLimpia?.size?:0) throw Exception("Indice no valido")

        println("Ahora escribe el numeron ")
        val numero = readlnOrNull()?.toInt()
        if (numero==null) throw Exception("Numero no valido")
        println("la posicion es $indice\n El numero a insertar es $numero")

        var numberslista=numbersArrayLimpia?.toMutableList()

        numberslista?.add(indice-1,numero)

        println("La nueva lista ${numberslista?.toTypedArray().contentToString()}")


    }


}