package com.example.console.exercises

import com.example.console.classes.Insect

fun Ex_21() {
    val Insect = Insect(30f, 2, 6, "Rojo, amarillo, azul, verde, etc.", 2, "Lepidoptera")
    println("1.\tCreen una clase llamada Insecto, que cuente con los siguientes atributos o características: longitud, #alas, #patas, color, #antenas, tipoinsecto. " +
            "\nEl primer atributo debe ser un float, el color y el tipoinsecto de tipo string y el resto valores enteros." +
            "\nEscriba las líneas de código que permitan especificar valores a la clase de manera privada e imprimir dichos valores en pantalla.")
    println("Mariposa\n")
    Insect.ShowInsect()
}