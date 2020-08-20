package org.example.simple

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

fun main() {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}
