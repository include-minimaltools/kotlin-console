package com.example.console.classes

class Planet(val name: String, val numberSatellites: Int, val mass: Double, val volume: Double, val distanceToTheSun: Double, val type: PlanetType) {

    init {
        println("Detalles del Planeta $name" +
                "\nNúmero de satélites: $numberSatellites" +
                "\nMasa: $mass" +
                "\nVolumen: $volume" +
                "\nDistancia del Sol: $distanceToTheSun" +
                "\nTipo de planeta: $type")
    }

    fun getDensity() : Double {
        return mass / volume
    }

    fun isExternal() : Boolean {
        return distanceToTheSun > 149597870
    }
}

enum class PlanetType(val description: String) {
    GAS_GIANT("Gaseoso"), TERRESTRIAL("Terrestre"), ICE_GIANT("Templado"), DWARF("Enano")
}