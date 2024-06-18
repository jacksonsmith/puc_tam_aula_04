package exercise

import com.example.myapplication.exercies.SortExercise
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class
SortExerciseUnitTest {

    @Test
    fun testSort_EmptyArray() {
        val exercise = SortExercise()

        val result = exercise.sort(emptyArray())
        assertArrayEquals(emptyArray(), result)
    }


    @Test
    fun testSort_SingleElementArray() {
        val exercise = SortExercise()

        val result = exercise.sort(arrayOf("apple"))
        assertArrayEquals(arrayOf("apple"), result)
    }

    @Test
    fun testSort_SortedArray() {
        val exercise = SortExercise()

        val input = arrayOf("apple", "banana", "cherry")
        val result = exercise.sort(input)
        assertArrayEquals(input.sortedArray(), result)
    }

    @Test
    fun testSort_ReverseSortedArray() {
        val exercise = SortExercise()

        val input = arrayOf("zebra", "lion", "bear")
        val result = exercise.sort(input)
        assertArrayEquals(input.sortedArray(), result)
    }

    @Test
    fun testSort_UnsortedArray() {
        val exercise = SortExercise()

        val input = arrayOf("banana", "apple", "cherry")
        val result = exercise.sort(input)
        assertArrayEquals(arrayOf("apple", "banana", "cherry"), result)
    }
}