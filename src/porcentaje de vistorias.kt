import java.io.File


fun main(){
    val pathName = "src/datos-partidos"
    val miArchivo = File(pathName)
    val contenido = miArchivo.readText()
    // println(contenido)

    val lineas = miArchivo.readLines()
    println(lineas[])
    lineas.forEach {print(it + " --- ")}


    var local: Int
    var goleslocal : Int
    var golesvisitante : Int
    var victorias : Int
    var empates : Int
    var perdidos : Int

}
