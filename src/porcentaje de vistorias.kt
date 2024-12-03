import java.io.File


fun main(){
    val pathName = "src/datos-partidos"
    val miArchivo = File(pathName)
    val contenido = miArchivo.readText()

    // println(contenido) Imprime todo el contenido

    val lineas = miArchivo.readLines()

  println(lineas[1]) // Imprime la linea i+1 Empieza en 0

    val partidosjugados : Int=lineas.size // Determina el numero de lineas que hay
    println("Fueron $partidosjugados Partidos Jugados"  )

    //lineas.forEach {print(it + " --- ")} Escribe las lineas una a uno, pudiendo añadir elementos entre cada linea


    var local: Int
    var goleslocal : Int
    var golesvisitante : Int
    var victorias : Int
    var empates : Int
    var perdidos : Int

}
