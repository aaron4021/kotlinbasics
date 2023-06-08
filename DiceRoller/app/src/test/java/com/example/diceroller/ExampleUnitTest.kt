package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun generatesNumber(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        assertTrue("the value of diceRoll was not between 1 and 6", diceRoll in 1..6)
    }
}