package com.example.kotlincodeexamples

fun main() {
    val peopleName = listOf("Fred","Ann","Barbara","Joe")
    println(peopleName.sorted())

    //use of sortedWith() Function
    println(peopleName.sortedWith{str1 : String,str2 : String -> str1.length - str2.length})
}