package com.example.console.exercises

import com.example.console.classes.Class

fun Ex_22() {
    val Teacher1 = Class("Glenda Barrios", "Programacion Grafica", 12, 13)
    val Teacher2 = Class("Alfonzo Boza", "Teoria de la computacion", 11, 5)

    //val (teachername, subject, labs, conferences) = Teacher2

    println("22.Cree una clase de tipo DataClass denominada Clase, los datos que requiere manejar deben ser: profesor, materia, laboratorios, Conferencias. " +
            "\nRealice las pruebas necesarias que le permitan asignarle valores e imprimir los resultados en pantalla.\n")

    println("El/La ${Teacher1.teachername} da clases de ${Teacher1.subject}, vamos ${Teacher1.labs} veces al laboratorio y recibimos ${Teacher1.conferences} conferencias en el semestre")
    println("El/La ${Teacher2.teachername} da clases de ${Teacher2.subject}, vamos ${Teacher2.labs} veces al laboratorio y recibimos ${Teacher2.conferences} conferencias en el semestre")

    println("\n${Teacher1.getInfo()}")
    println("\n${Teacher2.getInfo()}")
}