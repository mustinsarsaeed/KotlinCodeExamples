package com.example.kotlincodeexamples.exampleCode

fun main() {
    val triple : (Int) -> Int = {a: Int -> a * 3}  //a: Int -> a replace with it
    val triple2 : (Int) -> Int = {it * 3}
    println(triple(7))
    println(triple2(7))
}