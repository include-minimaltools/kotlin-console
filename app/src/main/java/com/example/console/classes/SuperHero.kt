package com.example.console.classes

data class SuperHeroI(var character: String, var movie: String, var realName: String, var releaseYear: Int)
{
    override fun toString(): String {
        return "$character"
    }
}
