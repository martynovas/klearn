package org.example.annotation

@Target(AnnotationTarget.CLASS)
annotation class MinMax(val min: Long, val max: Long)


@MinMax(0, 100)
class Money(val amount: Long)

fun main() {
    val money = Money(50)

    val minMax = money::class.annotations.find { it.annotationClass == MinMax::class } as MinMax

    println(minMax.min)
    println(minMax.max)
}
