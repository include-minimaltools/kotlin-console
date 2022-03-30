package com.example.console.exercises

private fun calculateNumbersFriend(number1: Int, number2: Int): String {

    var sum = 0

    for(i in 1 until number1){
        if(number1%i == 0) sum += i
    }

    if(sum == number2){
        sum = 0
        for(i in 1 until number2){
            if(number2%i == 0) sum += i
        }

        if(sum == number1) {
            return "son amigos"
        }else{
            return "no son amigos"
        }
    }else{
        return "no son amigos"
    }
}

fun Ex_17() {
    val Number1 : Int?
    val Number2 : Int?

    println("17.Escriba un programa que determine si dos números son amigos. Dos números enteros positivos se consideran amigos si " +
            "\nla suma de los divisores de uno es igual al otro número y viceversa. Por ejemplo, los números 220 y 284 son amigos. " +
            "\nLos divisores del número 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y suman 284. Los divisores de 284 son: 1, 2, 4, 71 y 142, que suman 220.\n")

    println("Ingrese el primer número: ")
    Number1 = readLine()?.toIntOrNull()

    println("Ingrese el segundo número: ")
    Number2 = readLine()?.toIntOrNull()

    if(Number1 == null || Number2 == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("Los numeros $Number1 y $Number2 ${calculateNumbersFriend(Number1, Number2)}")
}