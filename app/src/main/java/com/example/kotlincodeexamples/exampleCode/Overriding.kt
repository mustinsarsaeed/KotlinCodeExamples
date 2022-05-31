package com.example.kotlincodeexamples.exampleCode

/*overiding use for chainging in property and method in derived class
create main function and two class Mobile and onePlus
OnePlus inheritace from Mobile
Mobile Class make open
powerOff function make open
then override powerOff() method in onePlus and make object of OnePlus class in main and call powerOff() function*/
fun main() {
    val onePlus = onePlus()
    onePlus.powerOff()
}

open class Mobile {
    val name: String = ""
    val size: Int = 5
    fun makeCall() = println("Calling from Mobile")
    open fun powerOff() = println("Shutting Down")
    fun display() = println("Simple Mobile Display")
}
class onePlus : Mobile() {
    override fun powerOff() = println("Power Off")
}