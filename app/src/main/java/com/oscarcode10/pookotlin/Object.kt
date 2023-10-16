package com.oscarcode10.pookotlin

fun main() {
    /*val user1: User
    user1= User()
    user1.initialize("oscar", "ortiz", 17, "osca@a.a", "123")
    user1.show()
    user1.login()

    val user2: User
    user2=User()
    user2.initialize("andres", "ortiz", 17, "andres@a.a", "1234")
    user2.show()
    user2.login()*/

    /*val user1 = userContructorc*/

    val user1 = UserConstructor(name="andres", lastName="ortiz", age=17, email="osca@a.a", pswd="123")
    user1.show()
    user1.login()

    val user2 = UserParameter("andres", "ortiz", 17, "andres@a.a", "1234")
    user2.show()
    user2.login()
}