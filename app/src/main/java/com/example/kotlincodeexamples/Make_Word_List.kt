package com.example.kotlincodeexamples

fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filterWords = words.filter { it.startsWith("a", ignoreCase = true) }
    println(filterWords)

    //use of shuffled() Function
    val filterShuffled = words.filter { it.startsWith("B", ignoreCase = true) }.shuffled()
    println(filterShuffled)

    //use of take() function
    val filterTake = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2)
    println(filterTake)

    val filterSorted = words.filter { it.startsWith("c",ignoreCase = true) }.shuffled().take(3).sorted()
    println(filterSorted)
}