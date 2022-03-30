package com.example.console.exercises

fun Ex_12 () {
    val Number: Int?
    var Chain = mutableListOf<Int>()

    println("12.Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la figura\n")

    println("\nIngrese hasta que numero llegara la piramide: ")
    Number = readLine()?.toIntOrNull()

    if(Number == null || Number <= 0) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    var TempNumber = Number

    for(i in 1 .. Number){
        for (k in 1 ..TempNumber) print(" ")

        for(j in 1..i) Chain.add(j+1)

        Chain.removeLast()
        Chain.asReversed().forEach{
            print("$it")
        }
        Chain.clear()

        for(j in 1..i) print("$j")

        println()
        TempNumber--
    }
}