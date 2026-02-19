package com.example.iparcial.Grupo_4

/* Marielos Guadalupe Sanchez Martinez**/
lateinit var nombre: String
val mensaje : String by lazy { println("Espere un momento...")
    "Hola, Lucas!!"}
class manejoDatos{
    fun filtrarEdades(edades : List<Int>): List<Int>{
        return edades.filter { it>30 } }
    fun cantidadEdades(edades: List<Int>): Int {
        return edades.count { it > 30 } }

    fun ordenarNombres(nombres: List<String>): List<String> {
        return nombres.sorted() }

    fun ordenarEdadesDescendente(edades: List<Int>): List<Int> {
        return edades.sortedDescending() } }
fun main()
{ val manejador = manejoDatos()
    val edades = listOf(25, 30, 28, 22, 35, 40, 18, 32)
    val nombres = listOf("Ana", "Luis", "Carlos", "Maria", "Jorge")
    println("Edades mayores a 30: " + manejador.filtrarEdades(edades))
    println("Cantidad de edades mayores a 30: " + manejador.cantidadEdades(edades))
    println("\nNombres ordenados: " + manejador.ordenarNombres(nombres))
    println("Edades ordenadas de manera descendente: " + manejador.ordenarEdadesDescendente(edades))
    val frutas = mutableListOf("Manzana", "Banana", "Naranja", "Pera", "Uva")
    print("\nLista incial de frutas :" + frutas)
    frutas.add("Kiwi")
    frutas.remove("Banana")
    frutas[0] = "Mango"
    frutas.add("Fresa")
    println("\nLista modificada de frutas: " + frutas)
    val listas = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5)
    )
    val todo_junto = listas.flatten()
    println(listas)
    println(listas[0])
    println(listas[1])
    println(listas[2])
    println(todo_junto)
    data class Usuario(val nombre: String, val edad: Int)
    val usuarios = listOf(
        Usuario("Ana", 25),
        Usuario("Luis", 30),
        Usuario("Carlos", 18)
    )
    val usuariosOrdenados = usuarios.sortedBy { it.nombre }
    println("Uusarios sin ordenar: ")
    for (usuario in usuarios)
    { println(usuario.nombre + "," + usuario.edad) }
    println("Uusarios ordenados por la edad: ")
    for (usuario in usuariosOrdenados)
    { println(usuario.nombre + "," + usuario.edad) }
    nombre = "Paola"
    println("El nombre es : " + nombre)
    println("Antes del mensaje")
    println(mensaje)
    println("\nDespues del mensaje")
    println(mensaje)
}