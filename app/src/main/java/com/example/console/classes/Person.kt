package com.example.console.classes

class Person(
    private var Name: String,
    private var Lastname: String,
    private var Cedula: String,
    private var Sex: String,
    private var YearOfBirthday: String
) {

    init {
        println("19.\tImprima en pantalla los valores del objeto Persona desde un constructor. " +
                "\nLos atributos de la clase Persona deben tener: Nombres, Apellidos, Cedula, Sexo y AnioNacimiento.\n")

        println("Mi nombre es $Name $Lastname con cedula $Cedula, sexo $Sex y naci el $YearOfBirthday")
    }
    
}