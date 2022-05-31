package com.example.kotlincodeexamples.exampleCode

fun main() {
    val p1 = Person("Mustinsar",12)
    p1.age = -1
    println(p1.name)

}

class Person(namePerson: String, agePerson: Int) {
    var name: String = namePerson
        get() {
            return field.uppercase()
        }
    var age: Int = agePerson

        set(value) {
            if (value > 0) {
                //assign the value in value
                field = value
            } else {
                println("Age Can't be Negative")
            }
        }
}