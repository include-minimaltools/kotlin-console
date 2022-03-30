package com.example.console.exercises

import com.example.console.classes.*

fun Ex_20 () {
    println("20.Cree una clase abstracta denominada Figura, la cual deberá tener 4 subclases denominadas: Triangulo, Cuadrado, Circulo y Rectángulo." +
            "\nLa clase Figura debe tener la propiedad Nombre, la cual debe asignarse a través de las subclases, y el método área (), éste será abstracto y" +
            "\nsu implementación deberá hacerse desde las clases hijas, con la siguiente especificación:\n" +
            "a.Área del triángulo = base * altura /2\n" +
            "b.Área del circulo = PI * r al cuadrado\n" +
            "c.Área del rectángulo = Base * altura\n" +
            "d.Área del cuadrado = lado * lado\n" +
            "Mande a imprimir los valores, especificando como datos de entrada lo especificado debajo.\n")

    val Circle = Circle("Circle", 2f)
    println(Circle.Name)
    println(Circle.Area())

    val Rectangle = Rectangle("Rectangle", 1f, 2f)
    println("\n" + Rectangle.Name)
    println(Rectangle.Area())

    val Square = Square("Square", 3f)
    println("\n" + Square.Name)
    println(Square.Area())

    val Triangle = Triangle("Triangle", 3f, 5f)
    println("\n" + Triangle.Name)
    println(Triangle.Area())
}