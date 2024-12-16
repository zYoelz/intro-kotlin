package EjerciciosObjetos

class Caza(
    val ataque: Int,
    nombre: String, salud: Int, tripulacion: ArrayList<Tripulacion>

) : NaveEspacial(nombre, salud, tripulacion) {
    companion object {
        fun atacarAgetvidarestanteB(ataqueA: Int, vidaB: Int): Int {
            return vidaB - ataqueA
        }
    }
}