package exercise

import com.example.myapplication.exercies.LengthExercise
import junit.framework.TestCase.assertEquals
import org.junit.Test

class LengthExerciseUnitTest {

    @Test
    fun testLength_EmptyString() {
        val exercise = LengthExercise()
        val result = exercise.length("")
        assertEquals(0, result)
    }

    @Test
    fun testLength_test_is_length_4() {
        val exercise = LengthExercise()
        assertEquals(exercise.length("test"), 4)
    }

    @Test
    fun testLength_MultipleCharacterString() {
        val exercise = LengthExercise()

        val result = exercise.length("Hello")
        assertEquals(5, result)
    }

    @Test
    fun testLength_WhitespaceString() {
        val exercise = LengthExercise()

        val result = exercise.length("   ")
        assertEquals(3, result) // Whitespace characters are also counted
    }

    @Test
    fun testLength_SpecialCharacterString() {
        val exercise = LengthExercise()

        val result = exercise.length("!@#$%")
        assertEquals(5, result)
    }
}