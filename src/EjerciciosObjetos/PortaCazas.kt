package EjerciciosObjetos

class PortaCazas(
    nombre: String, salud: Int, tripulacion: ArrayList<Tripulacion>,
    var angar: ArrayList<Caza>

) : NaveEspacial(nombre, salud, tripulacion) {

    companion object {
        fun lanzarCaza(angar: ArrayList<Caza>, caza: Caza): ArrayList<Caza> {
            if (angar.remove(caza)) println("Caza ${caza.nombre} lanzado")
            else println("El caza ${caza.nombre} ya no estaba en el angar, lamzar otro")
            return angar
        }
    }
}