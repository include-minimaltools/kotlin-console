package com.example.console.classes

data class Class(val teachername: String, val subject: String, val labs: Int = 0, val conferences: Int) {
    fun getInfo(): String {
        return "Profesor: $teachername\nMateria: $subject\nLaboratorios: $labs\nConferencias: $conferences"
    }
}

/*
data class Class(val teachername: String){
    var subject: String = ""
    var labs: Int = 0
    var conferences: Int = 0
}
 */
