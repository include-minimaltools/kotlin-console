package com.example.console.exercises

private fun calculatedNameAdressPhoneNumber(name: String, address: String, phonenumber: String): String {
    return "Nombre: $name\tDireccion: $address\tTelefono: $phonenumber"
}

fun Ex_14 () {
    val Name = "Juan Carlos Pérez"
    val Address = "Ciudad Sandino 123"
    val PhoneNumber = "85859090 - Tigo"

    println("14.Crea las variables nombre, dirección y teléfono y asígnale los valores correspondientes. " +
            "\nMuestra los valores de esas variables de tal forma que el resultado del programa sea visible en una sola línea\n")

    println(calculatedNameAdressPhoneNumber(Name, Address, PhoneNumber))
}