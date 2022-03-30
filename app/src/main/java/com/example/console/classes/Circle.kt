package com.example.console.classes

class Circle(Name: String, private val radius: Float): Figure(Name) {
    override fun Area() = (Math.PI * Math.pow(radius.toDouble(), 2.0)).toFloat()
}


