package com.example.kotlincodeexamples.exampleCode

// Collections in Kotlin are used to store group of related objects
// in a single unit. By using collection, we can store, retrieve manipulate
// and aggregate data.
// 1) Collection  2) Mutable Collection
// Collection or Immutable collection also called Collection supports read only functionalities.
// Methods of immutable collection that supports read functionalities are:
//Collection Types	Methods of Immutable Collection
//List	listOf()
//listOf<T>()
//Map	mapOf()
//Set	setOf()
//Mutable Collection:
//Mutable collections supports both read and write functionalities.
//Methods of mutable collections that supports read and write functionalities are:
//Collection Types	Methods of Mutable Collection
//List	ArrayList<T>()
//arrayListOf()
//mutableListOf()
//Map	HashMap
//hashMapOf()
//mutableMapOf()
//Set	hashSetOf()
//mutableSetOf()
fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")

    //Learn about sets
    val setOfNumbers = numbers.toSet()
    println("set : ${setOfNumbers}")

    //Learn mutable Set
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2 : ${set1 == set2}")

    //contain method
    println("contains 7 : ${setOfNumbers.contains(7)}")


}