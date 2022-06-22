package com.example.kotlincodeexamples.exampleCode

fun main(args:Array<String>) {
    val fruiteName: String = fruite()
    println(fruiteName)
}

fun fruite(): String {

    val str: String? = "abc"
    val strLength : Int = if (str != null)str.length else -1
    val strLength2 : Int = str?.length ?: -1
    var string = "str = $str\n"+
            "strLength = $strLength\n" +
            "strLenght2 = $strLength2\n"
    fun check(textOne: String?,textTwo : String?) : String? {
        val textOne = textOne ?: return null
        val textTwo = textTwo ?: IllegalArgumentException("text Exception")

        return  "\n textOne = $textOne \n" +
                "\n textTwo = $textTwo \n"
    }
    string += "check(null,\"mango\") = ${check(null, "mango")}\n" +
            "check(\"apple\",\"orange\") = ${check("apple","orange")}\n"

    return string
}
