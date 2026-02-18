package com.example.iparcial.Grupo_1

/* AUTORA: Marielos Guadalupe Sanchez Martinez **/
class Persona(val Nombre:String, val Edad: Int){
    val mensaje = "Buenas tardes, mi nombre es" + Nombre + "y tengo $Edad aios."
}
fun main(){
    val Persona = Persona("Marielos", 25)
    println(Persona.mensaje)
}