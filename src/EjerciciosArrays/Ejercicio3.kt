package EjerciciosArrays

import Utils.Utiles

val utiles3 = Utiles()

object Ejercicio3 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de números se va a determinar cuantas veces se repido un numero dado\n"
        )
        println("Primero escribe la cadena de numeros separado por comas")
        val numbersArray = readlnOrNull() ?: ""
        if (numbersArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        val numbersArrayInt = utiles3.crearIntArray(numbersArray)

        println("La cadena es ${numbersArrayInt.contentToString()}\nAhora escribe el numero a contar ")
        val numero = readlnOrNull()?.toInt()
        if (numero == null) throw Exception("Numero no valido")
        println("El numero a contar es $numero")

        val contar = numbersArrayInt.count { it == numero }

        println("La cadena dada tiene $contar veces el numero $numero")


    }


}