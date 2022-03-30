package com.example.console.classes

abstract class Figure(val Name : String) {

    abstract fun Area(): Float

    fun PrintName(){
        println("El nombre de la figura es: $Name")
    }
}