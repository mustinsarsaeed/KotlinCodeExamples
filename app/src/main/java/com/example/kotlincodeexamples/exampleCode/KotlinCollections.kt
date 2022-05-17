package com.example.kotlincodeexamples.exampleCode

fun main() {
    val numbers = listOf(0,3,8,4,0,5,5,8,9,2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")

    //Learn about sets
    val setOfNumbers = numbers.toSet()
    println("set : ${setOfNumbers}")

    //Learn mutable Set
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2 : ${set1 == set2}")

    //contain method
    println("contains 7 : ${setOfNumbers.contains(7)}")


}