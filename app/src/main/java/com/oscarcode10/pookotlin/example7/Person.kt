package com.oscarcode10.pookotlin.example7

open class Person(val name: String, val age: Int) {
    open fun show(){
        println("El nombre es $name")
        println("Y la edad es $age")
    }
}