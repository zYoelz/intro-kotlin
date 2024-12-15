package EjerciciosObjetosyArrays

class Alumno(
    val id: Int,
    val nombre: String,
    var edad: Int,
    var isApproved: Boolean,
    var isProgressing: Boolean
) : AlumnoInterface {
    override fun cry() {
        println("$nombre es un llorón")
    }

    override fun toString(): String {
        return "Alumno(id = $id, nombre ='$nombre', edad = $edad, Aprovado = $isApproved , Progresa Adecuadamente = $isProgressing )\n"
    }

}