/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

@file:Suppress("KDocUnresolvedReference", "KDocUnresolvedReference", "KDocUnresolvedReference",
    "KDocUnresolvedReference"
)

package com.example.kotlincodeexamples

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
/**
 * Defines properties common to all dwellings.
 * All dwellings have floorspace,
 * but its calculation is specific to the subclass.
 * Checking and getting a room are implemented here
 * because they are the same for all Dwelling subclasses.
 *
 * residents Current number of residents
 */

abstract class Dwelling(private var resident: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    /**
     * Calculates the floor area of the dwelling.
     * Implemented by subclasses where shape is determined.
     *
     * @return floor area
     */
    abstract fun floorArea() : Double
    /**
     * Checks whether there is room for another resident.
     *
     * @return true if room available, false otherwise
     */
    fun hasRoom(): Boolean {
        return resident < capacity
    }
    /**
     * Compares the capacity to the number of residents and
     * if capacity is larger than number of residents,
     * add resident by increasing the number of residents.
     * Print the result.
     */
    fun getRoom() {
        if (capacity > resident) {
            resident++
            println("You Got a Room!")
        } else {
            println("Sorry, at Capacity and no rooms left")
        }
    }
}
/**
 * A square cabin dwelling.
 *
 *  @param residents Current number of residents
 *  @param length Length
 */

class SquareCabin(resident: Int, private val length : Double) : Dwelling(resident) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6
    /**
     * Calculates floor area for a square dwelling.
     *
     * @return floor area
     */

    override fun floorArea(): Double {
        return length * length
    }
}
/**
 * Dwelling with a circular floorspace
 *
 * @param residents Current number of residents
 * @param radius Radius
 */
open class RoundHut(resident: Int, private val radius : Double) : Dwelling(resident) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4
    /**
     * Calculates floor area for a round dwelling.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    /**
     *  Calculates the max length for a square carpet
     *  that fits the circular floor.
     *
     * @return length of carpet
     */
    fun calculateMaxCarpetSize() : Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter/2)
    }
}
/**
 * Round tower with multiple stories.
 *
 * @param residents Current number of residents
 * @param radius Radius
 * @param floors Number of stories
 */
class RoundTower(resident: Int, radius: Double, private val floors: Int = 2) : RoundHut(resident, radius) {
    override val buildingMaterial: String = "Stone"
    // Capacity depends on the number of floors.
    override val capacity: Int = floors * 4
    /**
     * Calculates the total floor area for a tower dwelling
     * with multiple stories.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}