package com.example.console

import com.example.console.exercises.*

val exercises = arrayOf(
    { Ex_1() }, { Ex_2() }, { Ex_3() }, { Ex_4() }, { Ex_5() }, { Ex_6() }, { Ex_7() }, { Ex_8() }, { Ex_9() }, { Ex_10() },
    { Ex_11() }, { Ex_12() }, { Ex_13() }, { Ex_14() }, { Ex_15() }, { Ex_16() }, { Ex_17() }, { Ex_18() }, { Ex_19() },
    { Ex_20() }, { Ex_21() }, { Ex_22() }, { Ev_1() },
    { Ev_2() }, { Ev_3() },
)

fun main() {
    try {
        do {
            println("Ingrese un numero | (1-22) -> Ejercicios : (23-25) -> Evaluacion :  26 -> Salir")

            val number: Int? = readLine()?.toIntOrNull()

            if(number == null || !(number in 1..exercises.size + 1)) {
                println("\nIngrese un numero valido")
                divider()
                continue
            }

            if(number in 1..exercises.size)
                openExercise(number - 1)
            else
                break

        } while(true)

        println("Gracias por usar el programa. FIN")
    } catch (e: Exception) {
        divider()
        println("Error: ${e.message}")
        divider()
        main()
    }
}

private fun openExercise(number: Int) {
    try {
        println("")
        divider()
        println("Ejecutando ejercicio ${number + 1}")
        exercises[number]()
        divider()
        println("Ejercicio ${number + 1} ejecutado con exito")
        divider()
    } catch (e: Exception) {
        openExercise(number)
    }
}

private fun divider() {
    (0..200).forEach { index ->
        if(index == 200)
            println("=")
        else
            print("=")
    }
}