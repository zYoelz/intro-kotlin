package EjerciciosArrays

import Utils.Utiles

val utiles5 = Utiles()

object Ejercicio5 {
    fun proceder() {
        println(
            "En este ejercicio creo una función que :\n" +
                    "Dado un array de string se va a añadir otro string al final de la array\n"
        )
        println("Primero escribe la cadena de string separada por comas")
        val stringArray = readlnOrNull() ?: ""
        if (stringArray.isEmpty()) throw Exception("Cadena Vacia") // Manda un error pero termina el programa, es poco interesante1
        var stringArrayOk = utiles5.crearStringArray(stringArray)

        println("La cadena es ${stringArrayOk.contentToString()}\nAhora escribe el string que quieres añadir")
        val string: String = readlnOrNull() ?: ""

        stringArrayOk+=string

        println(stringArrayOk.contentToString())

    }


}