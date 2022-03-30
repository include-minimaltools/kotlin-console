package com.example.console.exercises

fun calculateDayStatus(hour: Float): String {

    if(hour in 6.0..12.59) {
        return "Buenos días"
    } else if(hour in 13.0..20.59) {
        return "Buenas tardes"
    } else if (hour in 21.0..23.59 || hour in 0.0..5.59 || hour==24.0f) {
        return "Buenas noches"
    }else{
        return "Hora no valida"
    }
}

fun Ex_5() {
    val Hour : Float?

    println("5.Haciendo uso de las sentencias de control condicionales escriba un programa que pida una hora por teclado y que muestre como resultado Buenos días," +
            "\nBuenas tardes o Buenas noches, según la hora. Tome en cuenta que de 06 a 12 es mañana, de las 13 a las 20 es tarde y fuera de los rangos anteriores, noche.")

    println("\nIngrese la hora: ")
    Hour = readLine()?.toFloatOrNull()

    if(Hour == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\n${calculateDayStatus(Hour)}, La hora es: ${Hour} ${if(Hour in 0.0f..12.59f) "AM" else ""} ${if (Hour in 13.0f..23.59f || Hour==24.0f) "PM" else ""}")
}