package EjerciciosArrays

import Utils.Utiles

val utiles2 = Utiles()

object Ejercicio2 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se va a determinar si existe uno dentro de el\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull() ?: ""
        if (numbersArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        val numbersArrayInt = utiles2.crearIntArray(numbersArray)

        println("La cadena es ${numbersArrayInt.contentToString()}\nAhora escribe el numero a buscar ")
        val numero = readlnOrNull()?.toInt()
        if (numero == null) throw Exception("Numero no valido")
        println("El numero a buscar es $numero")

        if(numbersArrayInt.contains(numero)) {
            println("La cadena contiene el numero $numero")
        }else{
            println("La cadena no contiene el numero $numero")
        }


    }


}