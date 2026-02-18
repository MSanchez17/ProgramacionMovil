package com.example.iparcial.Grupo_1

/* AUTORA: Marielos Guadalupe Sanchez**/
class Rectangulo(val Base: Double, val Altura: Double) {
    fun calcularArea(): Double {
        return Base * Altura } }
fun main() {
    val rect = Rectangulo(7.0, 4.0)
    println("El área es: ${rect.calcularArea()}")
}