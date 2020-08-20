package org.example.simple

var x = 1

fun main(args: Array<String>) {
    println(::x.get()) // выведет "1"
    ::x.set(2)
    println(x)         // выведет "2"
}
