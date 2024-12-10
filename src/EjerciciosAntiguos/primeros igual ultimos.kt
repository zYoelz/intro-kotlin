package EjerciciosAntiguos

fun main() {
    println(
        "en una cadena dada vamos a comprovar si los 2 primeros caracteres son iguales a los 2 ultimos\n" +
                "ahora escriba la cadena a comparar"
    )
    var cadena = readLine().toString()
    val n = cadena.length
    if (cadena.substring(0, 2) == cadena.substring(cadena.length - 2, cadena.length)) {
        println("coincide")
    } else {
        println("no coincide")
    }


}