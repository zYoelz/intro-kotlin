fun main() {

    println("Escribe el primer numero")
    val a = Integer.valueOf(readLine())
    println("Escribe el segundo numero")
    val b : Int
    b = readLine()!!.toInt()
    if (a < b)
        println("el mayor es $b")
    else if (b < a)
        println("el mayor es $a")
    else
        println("los numeros son iguales ")
}