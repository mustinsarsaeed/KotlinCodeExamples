package com.example.kotlincodeexamples

fun main() {
    val squareCabin = SquareCabin(2)
    val roundHut = RoundHut(1)
    val roundTower = RoundTower(2)

    with(squareCabin) {
        println("\nSquare Cabin\n=======")
        println("Capacity: ${capacity}")
        println("Material : ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }
    with(roundHut) {
        println("\nRound Hut\n=======")
        println("Capacity: ${capacity}")
        println("Material : ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }
    with(roundTower) {
        println("\nRound Tower\n=======")
        println("Capacity: ${capacity}")
        println("Material : ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }
}

abstract class Dwelling(private var resident: Int) {

    abstract val capacity: Int
    abstract val buildingMaterial: String
    fun hasRoom(): Boolean {
        return resident < capacity
    }
}

class SquareCabin(resident: Int) : Dwelling(resident) {
    override val capacity: Int = 4
    override val buildingMaterial: String = "Wood"

}

class RoundHut(resident: Int) : Dwelling(resident) {
    override val capacity: Int = 3
    override val buildingMaterial: String = "Straw"

}

class RoundTower(resident: Int, private val floors: Int = 2) : Dwelling(resident) {
    override val capacity: Int = 4 * floors
    override val buildingMaterial: String = "Stone"
}