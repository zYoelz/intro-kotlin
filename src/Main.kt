//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // 1. Tipos de Datos

    // Enteros
    val entero : Int = 29
    val largo : Long = 123132131231L

    // Flotantes
    val float : Float = 3.14f
    val double : Double = 3.1415926000000

    // Booleanos
     var isFavorite : Boolean = true
    isFavorite = false

    //Caracteres (Char)
    val caracteres : Char = 'k'

    // Cadenas de caracteres (Strings)
    val regards : String = "Hola Mundo"

    // Imprimir por terminal
    println("Entero: "+ entero)
    println("isFavorite: " + isFavorite)
    println("regards: " +  regards)

    // 2. Bucles
    // For (y sus derivados) , While , Dowhile

    for(i in 0..5 step 2) {
        println("value for i: " + i)
    }
    var valueA = 3
    val valueB = 5
    while (valueA < valueB) {
        valueA++
        valueA.inc()
        valueA = valueA + 1
        valueA += 1
        println("Hola")
    }

    do {
        valueA++
    } while (valueA < valueB)

    //3.When (Cases)
    val day = 5
    when (day) {
        1 -> println("Hoy es lunes")
        2 -> println("Hoy es martes")
        3 -> println("Hoy es miercoles")
        4 -> println("Hoy es jueves")
        5 -> println("Hoy es viernes")
        else -> {
            println("no has ingresado un día válido")
        }
    }

//Condicionales

//== Comparar si dado dos argumentos son iguales. true/false
//&& Compara si dados dos condiciones, que ambas se cumplan. true/false
|| Compara si dadas dos o más condiciones, al menos 1 de cumpla. true/false
//< . true/false
//> . true/false
//<= .....
//>= .....
//*/

    var valueA = 2
    var valueB = 7
    if (valueA == 2 || valueB == 3) {
// Si se cumple, procede a la lógica
        if (valueB == 3) {
//Haz esto...
        } else {
//Sino aquello...
        }
    } else {
//Sino se cumple el argumento...
// Procede aqui.
    }

}