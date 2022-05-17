package com.example.kotlincodeexamples.exampleCode

/*Learn about Maps
    A map is useful when you have pairs of data,
    and you can identify each pair based on its key. The key "maps to" the corresponding value.*/
fun main() {
    val peopleAge = mutableMapOf<String,Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAge.put("Mustinsar",29)
    peopleAge["Aamir"] = 30
    println(peopleAge)

    //use of for Each
    peopleAge.forEach{ print("${it.key} is ${it.value},")}

    println()
    //use of map()
    println(peopleAge.map { "${it.key} is ${it.value}" }.joinToString(", "))

    println()
    //use of filter()
    val filterName = peopleAge.filter { it.key.length < 4 }
    println(filterName)


}