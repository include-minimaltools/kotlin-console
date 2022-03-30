package com.example.console.exercises

fun Ex_10() {
    /*var Result = calculateMultiples(160, 320, 20).reversed()*/

    println("10.Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.\n")

    /*for(i in Result.indices){
        println(Result[i])
    }*/

    for(i in 320 downTo 160){
        if(i % 20 == 0) println(i)
    }
}