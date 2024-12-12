package entities

class Clase(
    /** Atributos**/
    val id: Int,
    val name: String,
    var alumnos: ArrayList<Alumno>

) : ClassInterface {
    override fun addAlumno(alumno: Alumno) {
        alumnos.add(alumno)
        println("Número de alumnos: ${numeroDeAlumnos()}")

    }
    override fun numeroDeAlumnos() {
        return
    }

    override fun toString(): String {
        return "Clase(id=$id, name='$name', alumnos=$alumnos)"
    }


}


class Alumno(
    val id: Int,
    val nombre: String,
    var edad: Int
) : AlumnoInterface {
    override fun cry() {
        println("$nombre es un llorón")
    }

    override fun toString(): String {
        return "Alumno(id=$id, nombre='$nombre', edad=$edad)"
    }


}