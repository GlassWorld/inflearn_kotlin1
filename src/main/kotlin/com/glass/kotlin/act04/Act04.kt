package com.glass.kotlin.act04

import com.glass.java.act04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2){
        println("money1 > money2")
    }

    if(fun1() || fun2()){
        println("fun()")
    }
}

fun fun1(): Boolean {
    println("fun1()")
    return true
}

fun fun2(): Boolean {
    println("fun2()")
    return false
}