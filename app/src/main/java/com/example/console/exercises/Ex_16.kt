package com.example.console.exercises

fun Ex_16 () {
    val Number1 = 10
    val Number2 = 5
    val Number3 = 20

    val Funtion = { fun(number1: Int, number2: Int, number3: Int): Triple<Int, Float, Int> {
        val Sum = number1.plus(number2).plus(number3)
        val Average = Sum.toFloat().div(3)
        val Multiplication = number1.times(number2).times(number3)

        return Triple(Sum, Average, Multiplication)
    }
    }

    println("16.Haciendo uso de lambdas, escriba una función que calcule la suma, el producto y el promedio de tres números.\n")

    println("Suma, Promedio, Multiplicacion -> ${Funtion.invoke()(Number1, Number2, Number3)}")
}