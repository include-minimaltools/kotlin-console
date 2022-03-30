package com.example.console.classes

class Triangle(Name: String, private var base: Float, private var height: Float): Figure(Name) {
    override fun Area() = (base * height) / 2
}
