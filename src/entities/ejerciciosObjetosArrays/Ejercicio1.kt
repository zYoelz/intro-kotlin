package entities.ejerciciosObjetosArrays

import entities.Alumno
import entities.Clase
import entities.Utiles

var utiles = Utiles()

object Ejercicio1 {
    fun proceder() {

        println(
            "----------- Hola ------------\n" +
                    "En este primero ejercicio vamos a crear las clases y repartir los alumnos en ellas\n" +
                    "En el archivo src/Lista de alumnos tengo un listado con el nombre y la edad de los alumnos\n" +
                    "Teniendo en cuanta que las clases pueden tener como maximo 12 alumnos, repartimos los alumnos en 2 clases\n" +
                    "Las clases seran 2º E.S.O. A y 2ª E.S.O. B"
        )
        val alumnosPorClaseMax = 12
        val alumnosA: ArrayList<Alumno> = arrayListOf()
        val alumnosB: ArrayList<Alumno> = arrayListOf()

    utiles.añadirAlumnos(alumnosPorClaseMax,alumnosA)
        println(alumnosA)
    utiles.añadirAlumnos(alumnosPorClaseMax,alumnosB)
        println(alumnosB)
        /*
        alumnosA.add(Alumno(1, "Ana", 15))
        alumnosA.add(Alumno(2, "Antonio", 16))
        alumnosA.add(Alumno(3, "Lucia", 16))
        alumnosA.add(Alumno(4, "Pablo", 15))
        alumnosA.add(Alumno(5, "Juan", 15))
        alumnosA.add(Alumno(6, "Isabel", 15))
        alumnosA.add(Alumno(7, "Lua", 15))
        alumnosA.add(Alumno(8, "Fernando", 15))
        alumnosA.add(Alumno(9, "Paula", 15))
        alumnosA.add(Alumno(10, "Oscar", 15))

        alumnosB.add(Alumno(1, "Miguel", 15))
        alumnosB.add(Alumno(2, "Lea", 15))
        alumnosB.add(Alumno(3, "Alejandro", 15))
        alumnosB.add(Alumno(4, "Roberto", 15))
        alumnosB.add(Alumno(5, "Andrea", 15))
        alumnosB.add(Alumno(6, "Adriana", 15))
        alumnosB.add(Alumno(7, "Mar", 15))
        alumnosB.add(Alumno(8, "Lidia", 15))
        alumnosB.add(Alumno(9, "Susana", 15))
        alumnosB.add(Alumno(10, "Daniel ", 15))
        */


        val claseA = Clase(1, "3º E.S.O.  A", alumnosA)
        val claseB = Clase(2, "3º E.S.O.  B", alumnosB)

        println(claseA)
        println(claseB)
    }
}