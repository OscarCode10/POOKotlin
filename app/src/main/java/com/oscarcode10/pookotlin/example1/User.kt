package com.oscarcode10.pookotlin.example1

class User {
    var name:String=""
    var lastName:String=""
    var age:Int=0
    var email:String=""
    var pswd:String=""

    fun initialize(name:String, lastName:String, age:Int, email:String, pswd:String){
        this.name = name
        this.lastName = lastName
        this.age = age
        this.email = email
        this.pswd = pswd
    }

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