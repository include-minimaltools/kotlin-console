package com.example.console.exercises

private fun calculateMultiplyTable(number: Int): List<Int> {

    var list = mutableListOf<Int>()
    var i = 1

    do{
        list.add(number * i)
    }while(i++ < 12)

    return list
}

fun Ex_11() {
    val Number1: Int?
    var i = 1

    println("11.Muestra la tabla de multiplicar de un número especificado como parámetro\n")

    println("\nIngrese un número: (Tabla de multiplicar)")
    Number1 = readLine()?.toIntOrNull()

    if(Number1 == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nTabla de multiplicar del número: $Number1")

    calculateMultiplyTable(Number1).forEach{
        println("$Number1 x $i = $it")
        i++
    }
}