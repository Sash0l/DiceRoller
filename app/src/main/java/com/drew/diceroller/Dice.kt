package com.drew.diceroller

/**
 * Class that represents an n-sided dice
 * that can be rolled
 */
class Dice(private val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}