package com.example.kotlincodeexamples.exampleCode

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

/*In Kotlin, the vararg modifier allows you to pass a variable number of arguments of the same type into a function or constructor.
In that way, you can supply the different vegetables as individual strings instead of a list
Note: Only one parameter can be marked as vararg and is usually the last parameter in the list.*/
class Vegetables(private vararg val toppings: String) : Item("Vegetable", 5) {
    override fun toString(): String {
        /*ContactsContract.CommonDataKinds.Note: To specify a different separator other than a comma, pass in the desired
        separator string as an argument to the joinToString() method. Example: joinToString(" ") to separate each item with a space.*/
        return if (toppings.isEmpty()) {
            "$name Chef's Choice"
        } else {
            name + " " + toppings.joinToString()
        }
    }
}

class Order(private val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("$item : $${item.price}")
            total += item.price
        }
        println("Total : $${total}")
    }
}

fun main() {
    /*val noodles = Noodles()
    val vegetables = Vegetables(listOf("Cabbage", "Sprouts", "Onion"))
    val vegetables2 = Vegetables()
    println(noodles)
    println(vegetables)
    println(vegetables2)*/

    val ordersList = mutableListOf<Order>()
// Add an item to an order
    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    // Add multiple items individually
    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    // Add a list of items at one time
    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    // Use builder pattern
    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    // Create and add order directly
    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}