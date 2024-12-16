package EjerciciosAntiguos

fun main() {
    val alto: Float
    val largo: Float
    val ancho: Float

    println(
        "Vamos a calcular el volumen \nNecesitamos el alto, ancho y largo \nRecuerda usar las mismas unidades \nPrimero introduce el alto"
    )
    alto = readLine()!!.toFloat()
    println("Ahora el ancho ")
    ancho = readLine()!!.toFloat()
    println("Por ultimo el largo")
    largo = readLine()!!.toFloat()

    val volumen = volumen(alto, largo, ancho)
    println("El volumen es $volumen")

}

fun volumen(alto: Float, largo: Float, ancho: Float): Float {
    val volumen = alto * largo * ancho
    return volumen
}