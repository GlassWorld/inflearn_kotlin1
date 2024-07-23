package com.glass.kotlin.act03

import com.glass.java.act03.Person

fun main() {

    printAgeIfPerson(Person("KKK", 90))

    val name = "HIG"
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}