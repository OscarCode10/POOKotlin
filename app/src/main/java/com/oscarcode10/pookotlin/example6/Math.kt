package com.oscarcode10.pookotlin.example6

import java.lang.Math

object Math {
    val PI = 3.1416
    fun random(min: Int, max: Int)=((Math.random()*(max + 1 - min)) + min).toInt()
}