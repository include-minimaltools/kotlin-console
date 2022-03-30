package com.example.console.exercises

fun Ex_13 () {
    val X = 144f
    val Y = 999f

    println("13.Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999 respectivamente." +
            "\nA continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y " +
            "\nla multiplicación haciendo uso de los métodos de cada variable.\n")

    println("X = $X")
    println("Y = $Y")
    println("X + Y = ${X.plus(Y)}")
    println("X - Y = ${X.minus(Y)},\t Y - X = ${Y.minus(X)}")
    println("X * Y = ${X.times(Y)}")
    println("X / Y = ${X.div(Y)},\t Y / X = ${Y.div(X)}")
}