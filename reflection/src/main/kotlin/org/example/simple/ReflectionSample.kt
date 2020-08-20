package org.example.simple

import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaField

class User(private val fio: String) {
    private fun privateShowFio() {
        println(fio)
    }

    fun showFio() {
        println(fio)
    }
}

fun main() {
    val user = User("JAMES BOND")

    User::class.members.find { it.name == "privateShowFio" }
        ?.also { it.isAccessible = true }
        ?.call(user)

    User::class.memberProperties.find { it.name == "fio" }
        ?.also { it.isAccessible = true }
        ?.also { (it.javaField?.set(user, "diana")) }

//    User::class.members.find { it.name == "showFio" }
//        ?.also { it.isAccessible  = true}
//        ?.call(user)

    user.showFio()
}

