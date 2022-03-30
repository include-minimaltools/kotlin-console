package com.example.console.exercises

private fun calculateAreaOfTriangle(base: Int, height: Int): Float {
    return (base.toFloat() * height.toFloat() / 2)
}

fun Ex_1(){
    val Base : Int?
    val Height : Int?

    println("1.Cree una función en Kotlin para calcular el área de un triángulo, la función debe retornar el área " +
            "\ny recibir como parámetro la base y la altura. Impleméntelo usando variables de tipo val " +
            "\ny funciones de conversión de entero a float.")

    println("\nIngrese la base del triángulo: ")
    Base = readLine()?.toIntOrNull()

    println("\nIngrese la altura del triángulo: ")
    Height = readLine()?.toIntOrNull()

    if(Base == null || Height == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nEl área del triángulo es: ${calculateAreaOfTriangle(Base, Height)}")
}
