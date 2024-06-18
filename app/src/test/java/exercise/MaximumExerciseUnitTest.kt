package exercise

import com.example.myapplication.exercies.MaximumExercise
import junit.framework.TestCase.assertEquals
import org.junit.Test

class MaximumExerciseUnitTest {

    @Test
    fun testLength_BothPositiveNumbers() {
        val exercise = MaximumExercise()

        val max = exercise.max(5, 10)
        assertEquals(10, max)
    }

    @Test
    fun testLength_BothNegativeNumbers() {
        val exercise = MaximumExercise()

        val max = exercise.max(-8, -3)
        assertEquals(-3, max)
    }

    @Test
    fun testLength_PositiveAndNegativeNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(-2, 7)
        assertEquals(7, max)
    }

    @Test
    fun testLength_ZeroAndPositiveNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(0, 12)
        assertEquals(12, max)
    }

    @Test
    fun testLength_ZeroAndNegativeNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(-6, 0)
        assertEquals(0, max)
    }
}