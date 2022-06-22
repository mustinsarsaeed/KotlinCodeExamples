package com.example.kotlincodeexamples.exampleCode

import java.lang.Exception

//try,catch,finally,throw

//ArithmeticException : throw when we divide a number by zero
//ArrayIndexOutOfBoundExceptions : throw when an array has been tried to access with incorect index value.
//SecurityException : thrown by the security manager to indicate a security violation.

fun main(args:Array<String>) {
    try {
        val a = IntArray(5)
        a[5] = 10/5
    } catch (e:ArithmeticException) {
        println("Arithmetic Exception Catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException Catch")
    } catch (e: Exception) {
        println("Parent Exception Class")
    }
    println("code after try catch")
}