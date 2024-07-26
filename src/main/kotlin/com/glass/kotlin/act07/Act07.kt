package com.glass.kotlin.act07


fun main() {

    val print = FilePrinter()
    print.readFile()
    print.readFile2("test.txt")
}

fun parseIntOrThrow(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
