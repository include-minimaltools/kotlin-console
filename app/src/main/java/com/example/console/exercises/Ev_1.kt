package com.example.console.exercises

import com.example.console.classes.Planet
import com.example.console.classes.PlanetType
import java.text.DecimalFormat

fun Ev_1() {
    val dformat = DecimalFormat("#.####")

    // Probando la clase planeta
    val mars = Planet("Marte", 2, 500.00, 800.00, 50.0, PlanetType.GAS_GIANT)

    if (mars.isExternal())
        println("${mars.name} es un planeta externo")
    else
        println("${mars.name} es un planeta interno")
    println("La densidad de ${mars.name} es: ${mars.getDensity()}")
}
