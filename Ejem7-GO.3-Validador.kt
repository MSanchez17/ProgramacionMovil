package com.example.iparcial.Grupo_3.While

/* Marielos Guadalupe Sanchez Martinez**/

class Validador {
    fun iniciarSesion()
    {
        val claveCorrecta = "123456"
        var clave = ""
        while (clave != claveCorrecta)
        { print("Ingrese la contrasenia: ")
            clave = readLine()!!
            if (clave != claveCorrecta)
            {
                println("Contrasenia incorrecta")
            }
        }
        println("Acceso permitido")
    }
}