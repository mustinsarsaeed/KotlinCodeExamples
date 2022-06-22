package com.example.kotlincodeexamples.exampleCode

fun main(args: Array<String>) {
    val number = intArrayOf(4,8,16,32,64,128,256,512)
    val deno = intArrayOf(2,0,4,4,0,8)

    try {
        for (i in number.indices) {
            try {
                println(number[i].toString() + "/" + deno[i] + "is" + number[i] / deno[i])
            }catch (exc : ArithmeticException) {
                println("Can't Divided by Zero")
            }
        }
    } catch (exc : ArrayIndexOutOfBoundsException) {
        println("Element not Found")
    } finally {
        println("Finaly Block Code excute")
    }
}