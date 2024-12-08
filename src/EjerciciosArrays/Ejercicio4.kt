package EjerciciosArrays

import Utils.Utiles

val utiles4 = Utiles()

object Ejercicio4 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se va a imprimir otra array ordenada\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull() ?: ""
        if (numbersArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        val numbersArrayInt = utiles4.crearIntArray(numbersArray)

        println("La cadena es ${numbersArrayInt.contentToString()}")

        for (i in numbersArrayInt.indices)
            for(j in numbersArrayInt.indices)
                if (numbersArrayInt[i]<numbersArrayInt[j]){
                    var a=numbersArrayInt[i]
                    numbersArrayInt[i]=numbersArrayInt[j]
                    numbersArrayInt[j]=a
                }

        println(numbersArrayInt.contentToString())

    }


}