package EjerciciosObjetosyArrays

class Alumno(
    val id: Int,
    val nombre: String,
    var edad: Int,
    var nota:Int,
    var isApproved:Boolean ,
    var isProgressing: Boolean,
    var needHelp:Boolean
) : AlumnoInterface {
    companion object {
        fun isAproved(nota:Int):Boolean {
            if (nota < 5)  return false
            else return true
        }
        fun isNeedHelp (isApproved: Boolean,isProgressing: Boolean):Boolean{
            if (isProgressing == false && isApproved==false) return true
            else return false
        }

    }

    override fun cry() {
        println("$nombre es un llorón")
    }

    override fun toString(): String {
        return " $nombre ----> Necesita ayuda = $needHelp, Nota = $nota, Aprovado = $isApproved , Progresa Adecuadamente = $isProgressing, Edad = $edad, id = $id)\n"
    }

}