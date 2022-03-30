package com.example.console.exercises

import com.example.console.classes.Vehicle
import com.example.console.classes.VehicleType

fun Ev_3() {
    val vehicles = arrayOf(
        Vehicle("Toyota", 4, VehicleType.CAR, "Blanco"),
        Vehicle("Nissan", 6, VehicleType.VAN, "Negro")
    )

    vehicles[0].turnOn()

    vehicles.forEach {
        println("Marca ${it.brand}")
        println("Capacidad: ${it.capacity}")
        println("Tipo: ${it.type}")
        println("Color: ${it.color}")
        println("Estado: ${it.getStatus()}")

        println("========================================================================================================================================================================================================================================")
    }

}