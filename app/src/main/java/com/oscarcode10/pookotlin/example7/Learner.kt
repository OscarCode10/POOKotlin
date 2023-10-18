package com.oscarcode10.pookotlin.example7

class Learner(name: String, age: Int, val note: Int):Person(name, age){
    override fun show() {
        super.show()
        println("Note $note")
    }

    fun eval(){
        if (note>=50){
            println("Aprobaste, $name eres un crack")
        } else{
            println("Nooo $name, manquito")
        }
    }
}