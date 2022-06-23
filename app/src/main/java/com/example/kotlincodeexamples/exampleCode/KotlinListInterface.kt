package com.example.kotlincodeexamples.exampleCode

//List Interface Declaration
//public interface List<out E> : Collection<E> (source)
//Function of Kotlin List Interface
//Functions	Descriptions
//abstract fun contains(element: E): Boolean
// It checks specified element is contained in this collection.
//abstract fun containsAll(elements: Collection<E>): Boolean
// It checks all elements specified are contained in this collection.
//abstract operator fun get(index: Int): E
// It returns the element at given index from the list.
//abstract fun indexOf(element: E): Int
// Returns the index of first occurrence of specified element in the list, or -1 if specified element is not present in list.
//abstract fun isEmpty(): Boolean
// It returns the true if list is empty, otherwise false.
//abstract fun iterator(): Iterator<E>
// It returns an iterator over the elements of this list.
//abstract fun lastIndexOf(element: E):
// Int	It returns the index of last occurrence of specified element in the list, or return -1 if specified element is not present in list.
//abstract fun listIterator(): ListIterator<E>
// It returns a list iterator over the elements in proper sequence in current list.
//abstract fun listIterator(index: Int):
// ListIterator<E>	It returns a list iterator over the elements in proper sequence in current list, starting at specified index.
//abstract fun subList(fromIndex: Int, toIndex: Int):
//List It returns a part of list between fromIndex (inclusive) to toIndex (exclusive).

fun mian(args: Array<String>) {
    var list = listOf("Mali","Mhasan","MUmar")
    for (element in list) {
        println(element)

    }

    fun example2() {
        var list = listOf(1,2,3,"Mali","Mhasan","MUmar")

        for (element in list) {
            println(element)
        }
        println()
        for (index in 0..list.size-1) {
            println(list[index])
        }
    }
    fun example3() {
        var intList : List<Int> = listOf<Int>(1,2,3)
        var stringList : List<String> = listOf<String>("Ali","Hasan","Umar")
        var anyList : List<Any> = listOf(1,2,3,"Ali","Hasan","Umar")
        println("Print Int list")
        for (element in intList) {
            println(element)
        }
        println()
        println("String List")
        for (element in stringList) {
            println(element)
        }
        println()
        println("Any List")
        for (element in anyList) {
            println(element)
        }
    }
    fun example4() {
        var stringList : List<String> = listOf("Ali","Hasan","Umar")
        for (element in stringList) {
            println(element+"")
        }
        println()
        println(stringList.get(0))
        println(stringList.indexOf("Ali"))
        println(stringList.lastIndexOf("Hasan"))
        println(stringList.size)
        println(stringList.contains("Hasan"))
        println(stringList.containsAll(list))
        println(stringList.subList(2,3))
        println(stringList.isEmpty())
        println(stringList.drop(1))
        println(stringList.dropLast(2))

    }
}
