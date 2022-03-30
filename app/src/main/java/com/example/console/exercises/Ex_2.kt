package com.example.console.exercises

val PI = Math.PI

private fun calculateAreaOfCircle(radius: Int): Float {
    return (Math.pow(radius.toDouble(), 2.0) * PI).toFloat()
}

fun Ex_2() {
    val Radius : Int?

    println("2.Cree una función en Kotlin para calcular el área de un círculo, la función debe recibir como parámetro el radio " +
            "\ny retornar el área calculada, el valor de PI debe estar definido como una constante. Y el parámetro debe solicitarse al usuario," +
            "\nademás debe validarse el nulo con el operador elvis . Abajo un ejemplo de cómo solicitar un parámetro.")

    println("\nIngrese el radio del círculo: ")
    Radius = readLine()?.toIntOrNull()

    if(Radius == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nEl área del círculo es: ${calculateAreaOfCircle(Radius)}")
}