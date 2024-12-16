package EjerciciosObjetos

class Personaje(
    val nombre: String,
    val raza: String,

    ) : interfacePersonaje {
    val vidaMax: Int = getVidaMax(raza)
    var vida: Int = vidaMax
    val ataque: Int = getAtaque(raza)
    val defensa: Int = getDefensa(raza)


    private fun getVidaMax(raza: String): Int {
        when (raza) {
            "Humano" -> return 100
            "Orco" -> return 150
            "Elfo" -> return 50
            "Enano" -> return 100
        }
        return 0
    }

    private fun getAtaque(raza: String): Int {
        when (raza) {
            "Humano" -> return 100
            "Orco" -> return 100
            "Elfo" -> return 150
            "Enano" -> return 50
        }
        return 0
    }

    private fun getDefensa(raza: String): Int {
        when (raza) {
            "Humano" -> return 100
            "Orco" -> return 50
            "Elfo" -> return 100
            "Enano" -> return 150
        }
        return 0
    }


    override fun AtaqueAvsDefensaBgetVidaB(personajeA: Personaje, personajeB: Personaje): Int {
        var vidarestante: Double
        vidarestante = personajeB.vida.toDouble()
        val daño: Double = personajeA.ataque - (personajeB.defensa * 0.5 )
        vidarestante -= daño
        return vidarestante.toInt()
    }

    override fun crearPersonaje(): Personaje {
        println("Para crear el personaje primero necesitamos un nombre, escribe uno ")
        var nombre=""
        var raza=""
        do {
            nombre = readlnOrNull() ?: ""
            var salir = 0
            if (nombre == "") {
                println("El nombre no es correcto, escribe otro")
                salir = 1
            } else salir = 0
        } while (salir == 1)

        println("El nombre del personaje es $nombre")
        println(
            "Ahora elije una raza por su ID, puede ser:\n" + "1 - Humano\n2 - Orco\n3 - Elfo\n4 - Enano "
        )

        do {
            var salir = 0
            val respuestaRaza = readlnOrNull()?.toIntOrNull() ?: 0
            when (respuestaRaza) {
                1 -> raza = "Humano"
                2 -> raza = "Orco"
                3 -> raza = "Elfo"
                4 -> raza = "Enano"
                else -> {
                    println("respuesta no valida, intentalo de nuevo")
                    salir = 1
                }
            }
        } while (salir == 1)

        val personaje = Personaje(nombre, raza)
        return personaje
    }


    override fun toString(): String {
        return "Nombre = $nombre Raza = $raza\nVidaMax = $vidaMax ---- Actual = $vida\n Ataque = $ataque\nDefensa = $defensa"
    }

}