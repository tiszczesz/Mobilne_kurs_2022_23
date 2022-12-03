package com.niepolomice.fractionunitest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val s1:SimpleAdded = SimpleAdded(14,6)
        val expected = 20
        val actual = s1.MakeAdd(14,6)
        assertEquals(expected, actual)
    }
}