package EjerciciosArrays
object Ejercicio1 {
    fun proceder(){
        println("En este ejercicio creo una función que :\n" +
                "Dado un array de números se insertara un número dado en una posición designada.\n" +
                "Devuelve el nuevo array o nool en caso de que no sea posible\n")
        println("Primero escribe la cadena de numeros")
        var cadena = readlnOrNull()?.trim()?.toMutableList()
        println("La cadena es $cadena\nAhora escribe la posicion y el numero")
        var posicionynumero= readlnOrNull()
        posicionynumero= posicionynumero?.trim()
        println("la posicion es ${posicionynumero?.get(0)}\n El numero a insertar es ${posicionynumero?.get(1)}")

    }

}