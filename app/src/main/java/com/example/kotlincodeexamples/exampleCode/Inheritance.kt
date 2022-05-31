package com.example.kotlincodeexamples.exampleCode

fun main() {

    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent {
    // init use for check what constructor first call
    init {
        println("Parent Constructor is Called")
    }
    val name: String = ""

    fun myMethod() {
        println("I am Parent")
    }
}
class Child : Parent() {
    init {
        println("Child Constructor is Called")
    }
    val name2: String = ""

    fun myMethod2() {
        println("I am Child")
    }

}