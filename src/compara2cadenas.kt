fun main(){
    println("vamos a comparar dos cadenas daadas y ver si son iguales o no sin tener en cuenta las mayusculas\n" +
            "Primero escriba las cadenas separadas por un enter")
    val cadena1 = readLine().toString()
    val cadena2 = readLine().toString()
    if (cadena1.equals(cadena2,ignoreCase = true)){
        println("las cadenas son iguale")
    }else{
        println("las cadenas son distintas")
    }
}