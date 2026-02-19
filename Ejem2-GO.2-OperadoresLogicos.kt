package com.example.iparcial.Grupo_2

/* Marielos Guadalupe Sanchez Martinez**/

fun main()
{
    val verificador = Rango()
    println("\n---Operador AND---")
    println("Esta en el rango (10-20)?: ${verificador.estaEnRango(15)}")
    println("\n---Operador OR---")
    println("Es menor que 10 o mayor que 20?: ${verificador.estaFueraDeRango(25)}")
    println("\n---Operador NOT---")
    println("No esta en el rango?: ${verificador.noEstaEnRango(15)}")
}
class Rango{
    fun estaEnRango(numero : Int): Boolean{
        return numero > 10 && numero<20 }
    fun estaFueraDeRango(numero : Int): Boolean{
        return numero < 10 || numero>20 }
    fun noEstaEnRango(numero: Int): Boolean {
        return !(numero > 10 && numero < 20)
    }
}