package com.example.iparcial.Grupo_1

/* Marielos Guadalupe Sanchez Martinez **/

class Estudiante(val nombre: String?, var Nota1: Double, var Nota2: Double, var Nota3: Double) {

    fun calcularPromedio(): Double {
        return (Nota1 + Nota2 + Nota3) / 3 }
    fun aprobo(): Boolean {
        return calcularPromedio() >= 60 }

    fun mostrarInformacion() {
        println("Estudiante: $nombre")
        println("Promedio: ${calcularPromedio()} %")
        println("Aprobo: ${aprobo()}") } }

    fun main() {
        println("Ingrese el nombre del estudiante")
    val nombre =readln().toString()
        println("Ingrese las notas:")
        val n1 = readln().toDouble()
        val n2 = readln().toDouble()
        val n3 = readln().toDouble()
    val estudiante = Estudiante(nombre,n1, n2, n3)
        estudiante.mostrarInformacion()
}