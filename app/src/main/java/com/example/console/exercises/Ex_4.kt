package com.example.console.exercises

fun Ex_4() {
    val SpanishAndEnglishWords = arrayOf("Español\t\t\tIngles\n", "Hola\t\t\tHello", "Adiós\t\t\tGoodbye", "Buenos días\t\tGood Morning", "Buenas tardes\tGood Afternoon",
        "Buenas noches\tGood Night", "Como estás?\t\tHow are you?", "Qué haces?\t\tWhat do you do?", "Como te llams?\tWhat's your name?",
        "Dónde vives?\tWhere are you from?", "Eres casado?\tAre you married?")

    println("4.Haciendo uso de los Strings y los caracteres de tabulación escriba un programa que muestre en pantalla 10 palabras en inglés con su respectiva traducción en español," +
            "\ndeben estar distribuidas en dos columnas y alineadas a la izquierda. Pruebe con los caracteres de tabulación")

    SpanishAndEnglishWords.forEach{
        println(it)
    }
}