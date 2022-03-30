package com.example.console.exercises

fun calculateSpecifiedIntegers(number1 : Int = 20, number2: Int = 30, number3: Int = 10): List<Int> {

    if (number1 <= number2 && number1 < number3 && number2 <= number3) {
        return listOf(number1, number2, number3)
    } else if (number2 <= number1 && number2 < number3 && number1 <= number3) {
        return listOf(number2, number1, number3)
    } else if (number3 <= number1 && number3 < number2 && number1 <= number2) {
        return listOf(number3, number1, number2)
    }else{
        return listOf(number1, number2, number3)
    }
}

fun Ex_7() {
    val SpecifiedNumbers = calculateSpecifiedIntegers(20, 30, 10)

    println("7.Escribe un programa que ordene tres números enteros especificados como parámetro a la función\n")

    println("Los numeros especificados son (20, 30, 10)")

    SpecifiedNumbers.forEach{
        println(it)
    }
}