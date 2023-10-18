package com.oscarcode10.pookotlin.example5

import kotlin.random.Random

class User(val rol: Rol, val name: String, val age: Int) {
    fun showRol(){
        println("El rol de $name es $rol con la edad $age")
    }
}

fun main() {
    val rolRandom: Int = Random.nextInt(0, 4)
    val user = User(Rol.values().get(rolRandom), "Oscar", Random.nextInt(0, 100) )
    user.showRol()
}