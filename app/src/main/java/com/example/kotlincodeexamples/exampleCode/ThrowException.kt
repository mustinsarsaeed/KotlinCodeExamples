package com.example.kotlincodeexamples.exampleCode

import androidx.constraintlayout.motion.widget.TransitionBuilder.validate


fun main(args:Array<String>) {
    validate(19)
    println("code after validation check")
}
fun validate(age:Int) {
    if (age < 18) {
        throw ArithmeticException("Under Age")
    }else println("Eligible for Drive")
}