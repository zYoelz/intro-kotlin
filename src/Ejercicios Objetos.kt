import EjerciciosObjetos.MarcaCoche
import EjerciciosObjetos.Personaje

fun main() {

    println(
        "En los ejercicios de Objetos tenemos varios grupos de ejercicios relacionados\n" + "En los primeros 2 hablamos de coches eligelos con un 1\n" + "Los siguientes son de personajes e iteraciones con ellos eligelos con un 2\n" + "El ejercicio 5 eligelo con un 5\n" + "Ejercicio 6 con un 6\n" + "Ejercicio 7 con un 7"
    )

    var eleccionmenu = readlnOrNull()?.toIntOrNull() ?: 0
    when (eleccionmenu) {
        1 -> {
            println("El ejercicio 1 Nos pide Crear una clase coche con varios atributos, crear un objeto de esa clase e imprimirlo por pantalla")

            val bmw = MarcaCoche("BMW", "317", "Coupe Alpina", 90, 1981, "Alemania")

            println(bmw)

            println("El ejercicio 2 nos pide una funcion que devuelva un objeto conche con el atributo CV")
            // Añadimos el atributo CV a coche, aclaramos ese atributo en el coche anterior
// Creamos una funcion donde pida los datos al ususario y los guarde en un objeto

            println("Que Marca es tu coche")
            val marca = readlnOrNull() ?: ""
            println("Que Modelo es tu coche")
            val modelo = readlnOrNull() ?: ""
            println("que estilo tiene tu coche, puedes dejarlo vacio")
            val estilo = readlnOrNull() ?: ""
            println("Cuantos caballos tiene tu coche")
            val cv = readlnOrNull()?.toIntOrNull() ?: 0
            println("Año de Fabricacion")
            val anoFabricacion = readlnOrNull()?.toIntOrNull() ?: 0
            println("Pais de origen de tu coche")
            val paisOrigen = readlnOrNull() ?: ""

            val tuCoche = MarcaCoche(marca, modelo, estilo, cv, anoFabricacion, paisOrigen)

            println("Tu coche es $tuCoche")
        }

        2 -> {
            println("El ejercicio 3 nos pide crear una clase nueva llamada personaje")
            // En el personaje tendremos los siguientes Stats basicos
            // Nombre
            // Vida
            // Ataque
            // Defensa
            // Raza
            // La vida, defensa y ataque depenmderá de cada raza
            // Raza Humano (la mas equilibrada) VidaMax 100 Ataque 100 Defensa 100
            // Raza Orco VidaMax 150 Defensa 50 Ataque 100
            // Raza Elfo VidaMax 50 Defensa 100 Ataque 150
            // raza Enano VidaMax 100 Defensa 150 Ataque 50
            // Pediremos al usuario un Nick o Nombre y la raza
            val personaje=Personaje(nombre=String(),raza=String())
            val personajeA:Personaje=personaje.crearPersonaje()
            println(personajeA)
            println("Crea otro personaje")
            val personajeB:Personaje=personaje.crearPersonaje()
            println(personajeB)

            println("${personajeA.nombre} ataca a ${personajeB.nombre}")
            var vida=personaje.AtaqueAvsDefensaBgetVidaB(personajeA,personajeB)
            println("El personaje ${personajeB.nombre} pierde ${personajeB.vidaMax-vida} y se queda con $vida de vida")
        }

        else -> println("Eleccion no valida")
    }
}