package EjerciciosObjetosyArrays

import java.io.File

class Clase(
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

    companion object {

        var numerodeclases: Int = 0
        fun añadirAlumnos(alumnosPorClaseMax: Int, alumnos: ArrayList<Alumno>): ArrayList<Alumno> {

            val localizacionListaAlumnos = "src/EjerciciosObjetosyArrays/Lista de alumnos"
            val listadeAlumnos = File(localizacionListaAlumnos)
            val alumnosTotales = listadeAlumnos.readLines().size
            val alumnosarray = listadeAlumnos.readLines()
            var indicemax: Float



            if (alumnosTotales / 2 >= alumnosPorClaseMax) {
                indicemax = alumnosPorClaseMax.toFloat()

            } else {
                indicemax = alumnosTotales / 2.toFloat()

            }
            var alumnado = alumnosarray
            var a = numerodeclases * indicemax
            var b = indicemax + a - 1
            for (i in a.toInt()..b.toInt()) {
                val j = i
                val alumno = alumnado[j].split(" ").filter { it.isNotEmpty() }.toMutableList()
                alumnos.add(
                    Alumno(
                        j + 1,
                        alumno[0],
                        alumno[1].toInt(),
                        alumno[2].toInt(),
                        Alumno.isAproved(alumno[2].toInt()),
                        alumno[3].toBoolean(),
                        Alumno.isNeedHelp(Alumno.isAproved(alumno[2].toInt()), alumno[3].toBoolean())
                    )
                )
            }
            var numAlumnosNoAsignados = alumnosTotales - (b + 1).toInt()

            if ((numerodeclases != 0) && numAlumnosNoAsignados > 0) {
                println("Quedan $numAlumnosNoAsignados alumnos sin asignar a una clase")

                for (i in b.toInt() + 1..alumnosTotales - 1) {
                    val k = i
                    val alumnoSinAsignar = alumnado[k].split(" ").filter { it.isNotEmpty() }.toMutableList()
                    println("$alumnoSinAsignar ")

                }

            }

            numerodeclases += 1

            return alumnos
        }
    }
}

