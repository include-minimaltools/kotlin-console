package com.example.console.classes

class Square(Name: String, private var base : Float): Figure(Name) {
    override fun Area() = base * base
}