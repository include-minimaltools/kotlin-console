package com.example.console.exercises

fun calculateDayOfWeek(day: Int): String {
    return when(day){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia no valido"
    }
}

fun Ex_6() {
    val Day : Int?

    println("6.Escribe un programa que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.\n")

    println("\nIngrese el día: ")
    Day = readLine()?.toIntOrNull()

    if(Day == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nEl día es: ${calculateDayOfWeek(Day)}")
}