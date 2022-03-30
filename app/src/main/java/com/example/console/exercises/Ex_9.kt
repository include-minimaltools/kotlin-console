package com.example.console.exercises

private fun calculateMultiples(startingnumber: Int, finalnumber: Int, multiple: Int): List<Int> {

    var list = mutableListOf<Int>()
    var i = startingnumber

    do{
        if(i % multiple == 0){
            list.add(i)
        }
    }while(i++ <= finalnumber)

    return list
}

fun Ex_9 () {
    val Result = calculateMultiples(5, 100, 5)

    println("9.Muestra los números múltiplos de 5, de 5 a 100 utilizando un bucle do-while.\n")

    Result.forEach{
        println(it)
    }
}