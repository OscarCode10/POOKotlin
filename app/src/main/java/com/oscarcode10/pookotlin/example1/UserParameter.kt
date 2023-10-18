package com.oscarcode10.pookotlin.example1

class UserParameter(var name: String, var lastName: String, var age: Int, var email: String, var pswd: String) {

    fun show(){
        println("Nombre: $name, apellido: $lastName y edad: $age, ")
    }

    fun login(){
        if(email=="osca@a.a" && pswd=="123"){
            println("Puede ingresar")
        } else{
            println("No puede ingresar")
        }
    }
}