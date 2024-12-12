package entities

import java.io.File
var numerodeclases: Int = 0

class Utiles {



    fun añadirAlumnos(alumnosPorClaseMax: Int, alumnos: ArrayList<Alumno>): ArrayList<Alumno> {
        var indicemax : Float


        if (alumnosTotales / 2 >= alumnosPorClaseMax) {
            indicemax = alumnosPorClaseMax.toFloat()

        } else {
            indicemax = alumnosTotales / 2.toFloat()

        }
        var alumnado = alumnosarray
        var a = numerodeclases*indicemax
        val b = indicemax+a-1
        for (i in a.toInt()..b.toInt()) {
            val j = i
            val alumno = alumnado[j].split(" ").filter { it.isNotEmpty() }.toMutableList()
            alumnos.add(Alumno(j + 1, alumno[0], alumno[1].toInt()))
        }

        numerodeclases += 1
        return alumnos
    }


}

val localizacionListaAlumnos = "src/entities/Lista de alumnos"
val listadeAlumnos = File(localizacionListaAlumnos)
val alumnosTotales = listadeAlumnos.readLines().size
val alumnosarray = listadeAlumnos.readLines()



