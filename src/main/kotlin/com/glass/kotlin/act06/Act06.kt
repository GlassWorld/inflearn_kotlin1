package com.glass.kotlin.act06

fun main() {

    for(i in 1..10) {
        println(i)
    }

    println("---")

    for(i in 3 downTo 1) {
        println(i)
    }

    println("---")

    for(i in 1..10 step 2) {
        println(i)
    }

    println("---")

    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

}
