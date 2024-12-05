fun main() {
    println("hola en este programa vamos a eliminar un caracter determinado si esta al principio o al final de una cadena")
    println("Teclea la cadena de caracteres")
    val cadena = readLine().toString()
    println("Ahora escribe la letra a eliminar")
    val deletechar = readLine().toString()
    val resultado = result(cadena, deletechar)
    println("Entonces -$cadena- menos el caracter -$deletechar- queda -$resultado- ")
}

fun result(cadena: String, deletechar: String): String {
    var salida = cadena
    if (cadena==""){
        return salida
    }
    if (deletechar==""){
        return salida
    }
    if (cadena.startsWith(deletechar)) {
        salida = salida.substring(1,salida.length)
    }
    if (cadena.endsWith(deletechar)) {
        salida = salida.substring(0, salida.length - 1)
    }
    return salida
}