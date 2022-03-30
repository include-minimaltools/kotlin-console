package com.example.console.classes

class Rectangle(Name: String, private val base: Float, private val height: Float): Figure(Name) {
    override fun Area() = base * height
}

