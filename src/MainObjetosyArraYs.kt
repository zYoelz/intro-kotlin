import EjerciciosObjetosyArrays.Alumno
import EjerciciosObjetosyArrays.Clase



fun main () {


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

    Clase.añadirAlumnos(alumnosPorClaseMax, alumnosA)


           Clase.añadirAlumnos(alumnosPorClaseMax, alumnosB)

            val claseA = Clase(1, "3º E.S.O.  A", alumnosA)
            val claseB = Clase(2, "3º E.S.O.  B", alumnosB)

            println(claseA)
            println(claseB)



}