package com.example.iparcial.Grupo_3.DoWhile

/* Marielos Guadalupe Sanchez Martinez**/

class Menu{
    fun mostrarMenu()
    { var opcion : Int
        do{
            println("-------MENU-------")
            println("1. Saludar")
            println("2. Salir")
            println("Seleccione: ")
            opcion = readLine()!!.toInt()
            when (opcion)
            {
                1 -> println("Hola Usuario!")
                2 -> println("Saliendo...")

                else -> println("Opcion incorrecta")
            }
        } while(opcion !=2)
    }
}