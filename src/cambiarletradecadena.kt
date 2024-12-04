fun main() {
    println("Escriba una frase y luego elija que letras intercambiar\nAhora estriva la cadena")
    var cadena: String = readLine().toString()
    println("Escriba ahora el caracter a quitar")
    var caractdelet: String = readLine().toString().trim()
    println("escriba el caracter a poner")
    var caractput: String = readLine().toString().trim()

     cadena = cadena.replace(caractdelet, caractput)
//    cadena=sustituir(cadena,caractdelet,caractput)

    println("la cadena sustituida es : \n$cadena")
}

//fun sustituir(cadena:String, caractdelet:String ,caractput:String ):  {
//    var caracters=cadena.toCharArray()
//    var cadena1=cadena
//    var n=cadena.length
//    var j=0
//
//    for (i in caracters){
//
//        if (i == caractdelet) {
//           i = caractput
//        }
//        caracters[j]=i
//        j++
//    }
//    cadena1=caracters.toString()
//    return cadena1
//}