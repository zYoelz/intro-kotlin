package EjerciciosAntiguos

fun main(){
    println("Vamos a escribir por pantalla dos veces las dos ultimas letras de una cadena dada por pantalla\n" +
            "Primero escribe la cadena")
    val cadena = readLine().toString()
    val longitudcadena=cadena.length
    var resultado=cadena.substring(longitudcadena-2,longitudcadena)
    resultado="$resultado$resultado"
    println("el resultado seria $resultado")
}