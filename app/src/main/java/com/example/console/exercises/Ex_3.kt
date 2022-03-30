package com.example.console.exercises

private fun calculateWeeklySalary(hoursWorked: Int, salarybyhour: Int): Float {
    return ((hoursWorked * salarybyhour).toFloat())
}

fun Ex_3(){
    val SalaryByHour = 12
    val HoursWorked : Int?

    println("3.Escribe un programa que calcule el salario semanal de un colaborador en base a las horas trabajadas, a razón de \$12 la hora." +
            "\nEn la medida de lo posible haga uso de los métodos asociados a la variable.")

    println("\nIngrese las horas trabajadas: ")
    HoursWorked = readLine()?.toIntOrNull()

    if(HoursWorked == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nEl salario semanal es: ${calculateWeeklySalary(HoursWorked, SalaryByHour)}")
}