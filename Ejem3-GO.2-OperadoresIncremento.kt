package com.example.iparcial.Grupo_2

/* Marielos Guadalupe Sanchez Martinez**/
fun main()
{ val cont = Contador()
    println("Valor inicial: ${cont.numero}")
    cont.incrementar()
    println("Valor final: ${cont.numero}") }

class Contador{
    var numero: Int = 8
    fun incrementar()
    { numero++
    }
}