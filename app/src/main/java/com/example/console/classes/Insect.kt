package com.example.console.classes

class Insect() {
    private var lenght: Float = 0f
    private var wingsnumber: Int = 0
    private var paws: Int = 0
    private var color: String = ""
    private var antennasnumber: Int = 0
    private var insecttype: String = ""

    constructor(lenght: Float, wingsnumber: Int, paws: Int, color: String, antennasnumber: Int, insecttype: String) : this() {
        this.lenght = lenght
        this.wingsnumber = wingsnumber
        this.paws = paws
        this.color = color
        this.antennasnumber = antennasnumber
        this.insecttype = insecttype
    }

    fun ShowInsect() {
        println("Tipo de Insecto : $insecttype")
        println("Color : $color")
        println("Numero de antenas : $antennasnumber")
        println("Numero de patas : $paws")
        println("Numero de alas : $wingsnumber")
        println("Longitud del Insecto : $lenght")
    }
}