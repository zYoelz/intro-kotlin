val utiles = Utils.Utiles()
val tituloTexto = "Elige un ejercicio escribiendo el numero correspondiente\n"

fun main() {
    println(
        "\n \nHola estas en los ejercicios de Arrays.\n" +
                "Hay 6 ejercicios y tendras que elejir cual desear ejecutar \n"
    )
    var i = 1
    while (i == 1) {
        var j: Int?
        j = utiles.menu(tituloTexto)
        if (j == null) {
            println("\n\n\nNo as escrito un numero.\n¡¡Intentalo de nuevo!!")
            i = 1
        } else {

            if (j in 1..6) {
                println(
                    "Procedamos con el ejercicio $j\n" +
                            "Su enunciado es:\n${utiles.titulo(j)}\n\n" +
                            "---------------- Procedamos -----------------\n\n"
                )
                i =utiles.proceder(j)

            } else {
                println("Adios")
                i = 0
            }
        }
    }

}






