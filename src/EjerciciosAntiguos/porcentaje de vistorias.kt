import java.io.File


fun main() {
    val pathName = "src/datos-partidos"
    val miArchivo = File(pathName)
    val contenido = miArchivo.readText()

    // println(contenido) Imprime todo el contenido

    val lineas = miArchivo.readLines()

    println(lineas[1]) // Imprime la linea i+1 Empieza en 0

    val partidosJugados: Int = lineas.size // Determina el numero de lineas que hay
    println("Fueron $partidosJugados Partidos Jugados")

    //lineas.forEach {print(it + " --- ")} Escribe las lineas una a uno, pudiendo añadir elementos entre cada linea


    var local: Int = 0
    var visitante: Int = 0
    var golesLocal: Int = 0
    var golesEncontraLocal: Int = 0
    var golesVisitante: Int = 0
    var golesEncontraVisitante: Int = 0
    var victorias: Int = 0
    var empates: Int = 0
    var perdidos: Int = 0

    for (i in 0..partidosJugados - 1) {
        val j = i
        val analizar = lineas[j].split(" ").map { it.toInt() }.toTypedArray()
        if (analizar[0] == 1) {
            local += 1
            if (analizar[1] == analizar[2]) {
                empates += 1
            } else if (analizar[1] > analizar[2]) {
                victorias += 1
            } else {
                perdidos += 1
            }
            golesLocal += analizar[1]
            golesEncontraLocal += analizar[2]

        } else {
            visitante += 1
            if (analizar[1] == analizar[2]) empates += 1
            else if (analizar[1] > analizar[2]) perdidos += 1
            else victorias += 1
            golesVisitante += analizar[2]
            golesEncontraVisitante += analizar[1]
        }
    }
    println(
        "Se jugaron $partidosJugados partidos, $visitante como sisitante y $local como local\n" +
                "Se ganaron $victorias patidos que son un ${victorias / partidosJugados.toFloat() * 100}% de los partidos jugados\n" +
                "Se metieron $golesLocal goles como local y se recivieron $golesEncontraLocal goles en casa\n" +
                "Se metieron $golesVisitante goles como visitante y se recivieron como visitante $golesEncontraVisitante goles\n" +
                "Del total de goles el ${golesLocal / (golesLocal + golesVisitante).toFloat() * 100}% fueron en casa " +
                "y solo se recivieron el ${golesEncontraLocal / (golesEncontraLocal + golesEncontraVisitante).toFloat() * 100}%"
    )


}
