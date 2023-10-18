package com.oscarcode10.pookotlin.example2

class Client(var name: String, var balanceAccount: Float) {
    fun consign(value:Float){
        this.balanceAccount += value
    }

    fun withdrawals(value:Float){
        this.balanceAccount -= value
    }

    fun seeBalance(){
        println("$name, su saldo es $balanceAccount")
    }
}