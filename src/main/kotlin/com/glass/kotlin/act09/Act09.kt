package com.glass.kotlin.act09

fun main() {
    val person = Person("아무개", 99)
    println(person.name)
    person.age = 15
    println(person.age)

    var person2 = Person("오머니")
    println(person2.age)

    var person3 = Person()
    println(person3.name)
}

//class Person constructor(name: String, age: Int) {
//    val name = name
//    var age = age
//}

class Person(
    var name: String,
    var age: Int
) {

    val getUppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("age must be > 0")
        }
    }

    constructor(name: String) : this(name, 15) {
        println("서브1")
    }

    constructor() : this("누구야") {
        println("서브2")
    }

    val isAdulted: Boolean
        // get() = this.age >= 20
        get() {
            return this.age >= 20
        }
}

