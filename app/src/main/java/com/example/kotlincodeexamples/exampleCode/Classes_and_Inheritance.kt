/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

@file:Suppress("KDocUnresolvedReference", "KDocUnresolvedReference", "KDocUnresolvedReference",
    "KDocUnresolvedReference"
)

package com.example.kotlincodeexamples.exampleCode

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 15.5)

    with(squareCabin) {
        println("\nSquare Cabin\n=======")
        println("Capacity: $capacity")
        println("Material : $buildingMaterial")
        println("Floor Area : ${floorArea()}")
    }
    with(roundHut) {
        println("\nRound Hut\n=======")
        println("Material : $buildingMaterial")
        println("Capacity: $capacity")
        println("Floor Area: ${floorArea()}")
        println("Has Room? ${hasRoom()}")
        getRoom()
        println("Has Room? ${hasRoom()}")
        getRoom()
        println("Carpet Size : ${calculateMaxCarpetSize()}")
    }
    with(roundTower) {
        println("\nRound Tower\n=======")
        println("Material : $buildingMaterial")
        println("Capacity: $capacity")
        println("Floor Area: ${floorArea()}")
        println("Carpet Size : ${calculateMaxCarpetSize()}")
    }
}

abstract class Dwelling(private var resident: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    abstract fun floorArea() : Double
     // true if room available, false otherwise
    fun hasRoom(): Boolean {
        return resident < capacity
    }
    fun getRoom() {
        if (capacity > resident) {
            resident++
            println("You Got a Room!")
        } else {
            println("Sorry, at Capacity and no rooms left")
        }
    }
}

class SquareCabin(resident: Int, private val length : Double) : Dwelling(resident) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6
    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(resident: Int, private val radius : Double) : Dwelling(resident) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetSize() : Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter/2)
    }
}

class RoundTower(resident: Int, radius: Double, private val floors: Int = 2) : RoundHut(resident, radius) {
    override val buildingMaterial: String = "Stone"
    override val capacity: Int = floors * 4
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}