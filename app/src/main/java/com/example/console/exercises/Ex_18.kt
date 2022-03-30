package com.example.console.exercises

private fun calculateDuplicateNumbers(list: Array<Int>): List<Int> {

    var listofduplicateitems = mutableListOf<Int>()

    for(i in list){
        if(list.count { it == i } > 1){
            if(!listofduplicateitems.contains(i)){
                listofduplicateitems.add(i)
            }else continue
        }
    }
    return listofduplicateitems
}

fun Ex_18 () {
    val ListOfNumbers = arrayOf(1, 2, 2, 4, 5, 6, 7, 7, 9, 10)

    println("18.Escriba un programa que, dado un array de números enteros," +
            "\ndetermine cuáles son los elementos que se encuentran duplicados. Ejemplo de la salida esperada.\n")

    println("Valores del array: ${ListOfNumbers.contentToString()}")
    println("Elementos duplicados : ${calculateDuplicateNumbers(ListOfNumbers)}")
}