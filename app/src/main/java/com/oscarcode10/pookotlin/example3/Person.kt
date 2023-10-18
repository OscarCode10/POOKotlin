package com.oscarcode10.pookotlin.example3

class Person {
    var name: String = ""

        set (valor){
            field = valor.toUpperCase()
        }

        get (){
            return field
        }
    var age: Int = 0

        set (valor){
            if(valor<0){
                field = 0
            }
            else{
                field = valor
            }
        }
}