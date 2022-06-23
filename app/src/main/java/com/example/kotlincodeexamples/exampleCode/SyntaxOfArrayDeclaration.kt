package com.example.kotlincodeexamples.exampleCode

// It initializes the element of array of int type with size 5 with all elements as 0 (zero).
//var myArray = Array<Int>(5){0}
//Kotlin Array Declaration using Array of Function
//var myArray = arrayOf(1,10,20,32)

fun main(args:Array<String>) {
    var myArray = Array<Int>(5){0}

    for (element in myArray) {
        println(element)
    }
    example2()
    example3()
    example4()
    example5()
}
fun example2(){
    var myArray = Array<Int>(5){0}

    myArray[1] = 10
    myArray[3] = 15

    for (element in myArray) {
        println(element)
    }
}
fun example3() {
    val name = arrayOf<String>("A","B","C","D","E")
    var myArray2 = arrayOf<Int>(1,5,8,9,8)
    var myArray3 = arrayOf<Int>(4,3,6,7,5)
    var myArray4 = arrayOf(5,3,"C","E","A")
    var myArray5 : IntArray = intArrayOf(4,3,6,7,5)

    for (element in name) {
        println(element)
    }
    println()
    for (element in myArray2) {
        println(element)
    }
    println()
    for (element in myArray3) {
        println(element)
    }
    println()
    for (element in myArray4) {
        println(element)
    }
    println()
    for (element in myArray5) {
        println(element)
    }
}
fun example4() {
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    myArray5[6] = 18
    for (element in myArray5) {
        println(element)
    }
}
fun example5() {
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for (index in 0..4) {
        println(myArray5[index])
    }
    println()
    for (index in 0..myArray5.size-1) {
        println(myArray5[index])
    }

}