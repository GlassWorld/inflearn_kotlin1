package com.glass.kotlin.act05

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score > 0) {
        throw IllegalArgumentException("The score can not be negative - $score")
    }
}


fun validateScore(score: Int) {
    if (score in 0..100) {

    }
}

fun startsWith(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("is 1, 0, -1")
        else -> println("1, 0, -1 is not")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70.. 79 -> "C"
        else -> "D"
    }
}

fun getGrade2(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}