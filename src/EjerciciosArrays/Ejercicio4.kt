package EjerciciosArrays
/*
1.solicitar al usuario un cadena de numeros separados por comas que quiera ordenar
2.evaluar datos ingresados
3.crear funcion que ordene la array
4.introducir como argumento la array a ordenar dentro de la funcion
5.imprimir la funcion ordenada
 */
import Utils.Utiles

val utiles4 = Utiles()

object Ejercicio4 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se va a imprimir otra array ordenada\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull()
        numbersArray?.let { numbers ->

            if (numbers.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1

            val numbersArrayInt = utiles4.crearIntArray(numbers)

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


}