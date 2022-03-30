package com.example.console.exercises

import com.example.console.classes.SuperHeroI

fun Ev_2() {
    var superHeros: MutableList<SuperHeroI> = mutableListOf()

    (0..150).forEach { i ->
        if(i == 70)
            print("Lista Inmutable")
        else if(i == 150)
            print("=\n")
        else
            print("=")

    }

    superHeros.addAll(
        arrayOf(
            SuperHeroI("Iron Man", "Avengers", "Robert Downey", 2021),
            SuperHeroI("Capitan America", "Avengers", "Robert Downey", 2021),
            SuperHeroI("Spiderman", "Spiderman", "Tom Holland", 2021),
            SuperHeroI("Halcon", "Avengers", "Robert Downey", 2021)
        )
    )

    println("Cantidad de elementos: ${superHeros.size}" +
            "\nPrimer registro de la lista ${superHeros.first()}" +
            "\nSegundo elemento de la lista: ${superHeros[2]}" +
            "\nUltimo elemento de la lista: ${superHeros.last()}")

    superHeros.forEach { hero ->
        println("Personaje: ${hero.component1()} - Pelicula: ${hero.component2()}")
    }
}