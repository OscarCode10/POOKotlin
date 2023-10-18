package com.oscarcode10.pookotlin.example4

fun main() {
    // Data Class sirve para guardar datos, como un Array
    val product1 = Product(1, "Leche", 20000.0)
    val product2 = Product(2, "Papa", 10000.0)

    println(product1)
    println(product2)

    product1.price = 30000.0
    println(product1)

    var product3 = product2.copy() //Copiar el producto
    product3.idProduct = 3
    product3.price = 28000.0
    println(product3)

}