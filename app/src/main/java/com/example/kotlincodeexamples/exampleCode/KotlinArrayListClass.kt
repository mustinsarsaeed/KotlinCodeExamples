package com.example.kotlincodeexamples.exampleCode

//Kotlin ArrayList class is used to create a dynamic array. Which means the size of ArrayList class can be increased or decreased according to requirement. ArrayList class provides both read and write functionalities.
//
//Kotlin ArrayList class follows the sequence of insertion order. ArrayList class is non synchronized and it may contains duplicate elements. The elements of ArrayList class are accessed randomly as it works on index basis.

//Constructor of ArrayList Class
//Constructor	Description
//ArrayList<E>()	It is used to create an empty ArrayList
//ArrayList(capacity: Int)	It is used to create an ArrayList of specified capacity.
//ArrayList(elements: Collection<E>)	It is used to create an ArrayList filled from the elements of collection.

//Functio of Kotlin ArrayList
//Function	Description
//open fun add(element: E): Boolean
// It is used to add the specific element into the collection.
//open fun add(index: Int, element: E)
// It is used to insert an element at specific index.
//open fun addAll(elements: Collection<E>): Boolean
// It is used to add all the elements in the specified collection to current collection.
//open fun addAll(index: Int, elements: Collection<E>):
// Boolean	It is used to add all the elements of specified collection into the current list at the specified index.
//open fun clear()
// It is used to removes all elements from the collection.
//open fun get(index: Int): E
// It is used to return the element at specified index in the list.
//open fun indexOf(element: E):
// Int	It is used to return the index of first occurrence of specified element in the list or return -1 if the specified element in not present in the list.
//open fun lastIndexOf(element: E):
// Int	It is used to return the last occurrence of given element from the list or it returns -1 if the given element is not present in the list.
//open fun remove(element: E):
// Boolean	It is used to remove a single instance of the specific element from current collection, if it is available.
//open fun removeAt(index: Int): E
// It is used to remove the specific index element from the list.
//open fun removeRange(startIndex: Int, endIndex: Int)
// Its remove the range of elements starting from startIndex to endIndex in which endIndex is not includes.
//open fun set(index: Int, element: E): E
// It is used to replaces the element from the specified position from current list with the specified element.
//open fun toArray(): Array<Any?>
// It is used to return new array of type Array<Any?> with the elements of this collection.
//open fun toString(): String
// It is used to returns a string representation of the object.
//fun trimToSize()
// It does nothing in this ArrayList implementation.
// Kotlin ArrayList Example 1- empty ArrayList

fun main(args: Array<String>) {
    //Creating an empty ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("Ali")
    arrayList.add("Mohsan")
    arrayList.add("Qasim")
    println("Print ArrayList")
    for (i in arrayList) {
        println(i)
    }
    // Kotlin ArrayList Example 2- initialize ArrayList capacity
    fun example2() {
        arrayList.add("Shahzad")
        arrayList.add("Muzamil")
        arrayList.add("zohaib")
        println("Print ArrayList")
        for (i in arrayList) {
            println(i)
        }
        println("Size Of ArrayList =" + arrayList.size)
        val arrayList2 = ArrayList<Int>(5)
        arrayList2.add(14)
        arrayList2.add(20)
        arrayList2.add(80)
        println("Print ArrayList 2")
        for (i in arrayList2) {
            println(i)
        }
        println("Size of ArrayList2 = " + arrayList2.size)
    }
//    Kotlin ArrayList Example 3- filled elements in ArrayList using collection
    fun example3() {
        val arrayList : ArrayList<String> = ArrayList<String>(5)
        var list : MutableList<String> = mutableListOf<String>()

        list.add("Shahzad")
        list.add("Muzamil")
        list.add("zohaib")

        arrayList.addAll(list)
        println("Print ArrayList")
        val itr = arrayList.iterator()
        while (itr.hasNext()) {
            println(itr.next())
        }
        println("Size of Array List "+ arrayList.size)
    }
  //  Kotlin ArrayList Example 4 - get()
    fun example4() {
        val arrayList : ArrayList<String> = ArrayList<String>(5)

      arrayList.add("Ali")
      arrayList.add("Hasan")
      arrayList.add("Akbar")
      arrayList.add("Qasim")

      println("Print ArrayList")
      for (i in arrayList) {
          println(i)
      }
      println("ArrayList.get(2)")
      println(arrayList.get(2))
    }
    //Kotlin ArrayList Example 5 - set()
    fun example5() {
        val arrayList : ArrayList<String> = ArrayList<String>(5)

        arrayList.add("Ali")
        arrayList.add("Hasan")
        arrayList.add("Akbar")
        arrayList.add("Qasim")

        println("Print Array List")
        for (i in arrayList) {
            println(i)
        }
        println("ArrayList.get(2,\"Mansoor\")...")
        arrayList.set(2,"Mansoor")
        println("Print ArrayList")
        for (i in arrayList) {
            println(i)
        }
    }
// Kotlin ArrayList Example 6 - indexOf()
    fun example6(){
    val arrayList : ArrayList<String> = ArrayList(5)
    arrayList.add("Ali")
    arrayList.add("Hasan")
    arrayList.add("Akbar")
    arrayList.add("Qasim")

    println("Print ArrayList")
    for (i in arrayList) {
        println(i)
    }
    println("arrayList.IndexOf")
    println(arrayList.indexOf("Ali"))
    }

// Kotlin ArrayList Example 7 - lastIndexOf()
    fun example7() {
        val arrayList : ArrayList<String> = ArrayList(5)
    arrayList.add("Ali")
    arrayList.add("Hasan")
    arrayList.add("Akbar")
    arrayList.add("Qasim")

    println("Print ArrayList")
    for (i in arrayList) {
        println(i)
    }
    println("ArrayList.lastIndexOf")
    println(arrayList.lastIndexOf("Akbar"))
    }

// Kotlin ArrayList Example 8 - remove()
    fun example8() {
        val arrayList : ArrayList<String> = ArrayList(4)
    arrayList.add("Ali")
    arrayList.add("Hasan")
    arrayList.add("Akbar")
    arrayList.add("Qasim")

    println("Print ArrayList")
    for (i in arrayList) {
        println(i)
    }
    println("ArrayList.remove(2)")
    println(arrayList.remove("Ali"))
    for (i in arrayList) {
        println(i)
    }

    }

//Kotlin ArrayList Example 9 - removeAt()
    fun example9() {
        val arrayList : ArrayList<String> = ArrayList(4)
    arrayList.add("Ali")
    arrayList.add("Hasan")
    arrayList.add("Akbar")
    arrayList.add("Qasim")

    println("Print ArrayList")
    for (i in arrayList) {
        println(i)
    }
    println("ArrayList.removeAt")
    println(arrayList.removeAt(3))
    for (i in arrayList) {
        println(i)
    }
    }
//Kotlin ArrayList Example 10 - clear()
    fun example10() {
        val arrayList : ArrayList<String> = ArrayList(3)
    
    }
}