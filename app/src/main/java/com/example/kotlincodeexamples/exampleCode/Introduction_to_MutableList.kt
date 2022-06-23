package com.example.kotlincodeexamples.exampleCode

//Function	Descriptions
//abstract fun add(element: E): Boolean
// It adds the given element to the collection.
//abstract fun add(index: Int, element: E)
// It adds the element at specified index.
//abstract fun addAll(elements: Collection<E>):
// Boolean	It adds all the elements of given collection to current collection.
//abstract fun clear()
// It removes all the elements from this collection.
//abstract fun listIterator(): MutableListIterator<E>
// It returns a list iterator over the elements in proper sequence in current list.
//abstract fun listIterator(index: Int): MutableListIterator<E>
// It returns a list iterator starting from specified index over the elements in list in proper sequence.
//abstract fun remove(element: E): Boolean
// It removes the specified element if it present in current collection.
//abstract fun removeAll(elements: Collection<E>):
// Boolean	It removes all the elements from the current list which are also present in the specified collection.
//abstract fun removeAt(index: Int): E	It removes element at given index from the list.
//abstract fun retainAll(elements: Collection<E>):
// Boolean	It retains all the elements within the current collection which are present in given collection.
//abstract operator fun set(index: Int, element: E): E
// It replaces the element and add new at given index with specified element.
//abstract fun subList(
//    fromIndex: Int,
//    toIndex: Int
//): MutableList<E>
// It returns part of list from specified fromIndex (inclusive) to toIndex (exclusive) from current list. The returned list is backed by current list, so non-structural changes in the returned list are reflected in current list, and vice-versa.
fun main() {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")
}