package com.oscarcode10.pookotlin.example2

class ATM {
    val client1: Client = Client("Oscar", 100000f)
    val client2: Client = Client("AndrÃ©s", 10000000f)
    val client3: Client = Client("Angie", 50000f)

    fun transcactional(){
        client1.consign(50000f)
        client2.consign(2000f)
        client3.consign(500000f)
        client3.withdrawals(15000f)
    }

    fun totalBalance(){
        val totalBalance = client1.balanceAccount + client2.balanceAccount + client3.balanceAccount
        println("El cajero tiene en total de $totalBalance en saldo")
                client1.seeBalance()
                client2.seeBalance()
                client3.seeBalance()
    }
}