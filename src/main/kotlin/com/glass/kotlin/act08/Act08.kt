package com.glass.kotlin.act08

fun main() {


}

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num){
        if(useNewLine) println(str)
        else print(str)
    }
}