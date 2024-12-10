package entities

class Clase(
    /** Atributos**/
    val id: Int,
    val name: String,
    var alumnos: ArrayList<Alumno>

) : ClassInterface {
    override fun addAlumno(alumno: Alumno) {
        alumnos.add(Alumno)
        numeroDeAlumnos()
    }

    companion object
}


class Alumno(
    val id: Int,
    val nombre: String,
    var edad: Int
) : AlumnoInterface {
    override fun cry() {
    }

    companion object


}