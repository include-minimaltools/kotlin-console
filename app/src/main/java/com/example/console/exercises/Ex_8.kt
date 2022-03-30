package com.example.console.exercises

private fun calculateAWorkersWeeklySalary(hoursWorked: Int, daysWorked: Int) : Int {
    if(hoursWorked in 0..40){
        return ((hoursWorked * 12) * daysWorked)
    }else if(hoursWorked >= 41){
        return ((((hoursWorked-40)*16)+480) * daysWorked)
    }
    else{
        return 0
    }
}

fun Ex_8 () {
    val HoursWorked : Int?
    val DaysWorked = 5

    println("8.Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo)" +
            "\nse pagan a \$12 dólares la hora. A partir de la hora 41, se pagan a 16. El programa debe recibir como parámetro el total de horas trabajadas a la semana.\n")

    println("\nIngrese las horas trabajadas: ")
    HoursWorked = readLine()?.toIntOrNull()

    if(HoursWorked == null || HoursWorked < 0) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

    println("\nEl salario semanal es: $ ${calculateAWorkersWeeklySalary(HoursWorked, DaysWorked,)}")
}