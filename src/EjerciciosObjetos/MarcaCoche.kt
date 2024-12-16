package EjerciciosObjetos

class MarcaCoche(
    val marca: String,
    val modelo: String,
    val estilo:String,
    val caballos: Int,
    val añoFabricacion : Int,
    val paisOrigen: String
) {
   override fun toString(): String {
       return "Coche ----> Marca = $marca Modelo = $modelo Estilo = $estilo CV = $caballos Año = $añoFabricacion País = $paisOrigen"
   }

}