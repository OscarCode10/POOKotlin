package com.oscarcode10.pookotlin.example1

class UserConstructor constructor(name:String, lastName:String, age:Int, email:String, pswd:String){
    var name: String=name
    var lastName: String=lastName
    var age: Int=age
    var email: String=email
    var pswd: String=pswd

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