package org.example.simple

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

class A(val p: Int)

fun main(args: Array<String>) {
    println(A::p.javaGetter)
    println(A::p.javaField)
}
