package EjerciciosObjetos

interface interfacePersonaje {
    fun AtaqueAvsDefensaBgetVidaB(personajeA: Personaje, personajeB: Personaje): Int
    fun crearPersonaje(): Personaje
}