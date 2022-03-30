package com.example.console.classes

enum class Status(val status: Int) {
    ON(1),
    OFF(0)
}

enum class VehicleType(val description: String){
    VAN("Camioneta"),
    MOTORCYCLE("Moto"),
    CAR("Carro"),
    MINIBUS("Microbus"),
}

class Vehicle(brand: String, capacity: Int, type: VehicleType, color: String) {
    var brand: String = brand
    var capacity: Int = capacity
    var type: VehicleType = type
    var color: String = color

    private var status: Status = Status.OFF


    fun turnOn() = Status.ON.also { this.status = it }

    fun turnOff() = Status.OFF.also { this.status = it }

    fun getStatus() : String = status.toString()

}