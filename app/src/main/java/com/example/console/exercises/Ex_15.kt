package com.example.console.exercises

private fun calculateAverageAndSum(list: List<Int>): Pair<Float, Int> {

    var sum = 0
    var average : Float?

    for(i in list){
        sum += i
    }

    average = sum.toFloat() / list.size

    return Pair(average, sum)
}

fun Ex_15 () {
    val ArrayOfNumbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("15.Escribe un programa que calcule el promedio y la suma de un arreglo de 10 números enteros.\n")

    println("Valores del array: $ArrayOfNumbers")
    println("(Promedio, Suma) : ${calculateAverageAndSum(ArrayOfNumbers)}")
}