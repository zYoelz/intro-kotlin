package EjerciciosArrays

import Utils.Utiles

val utiles6 = Utiles()

object Ejercicio6 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se va a determinar cual es el `romer numero que falta\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull() ?: ""
        if (numbersArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        val numbersArrayInt = utiles6.crearIntArray(numbersArray)

        println("La cadena es ${numbersArrayInt.contentToString()}")
        for (i in 1..100000){
            if (numbersArrayInt.contains(i)==false){
                println("La cadena no tiene el numero $i y es el primero que falta")
                break
            }
        }


    }
}