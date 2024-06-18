package exercise

import com.example.myapplication.exercies.PalindromeExercise
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class
PalindromeExerciseUnitTest {

    @Test
    fun testIsPalindrome_EmptyString() {
        val exercise = PalindromeExercise()
        val result = exercise.isPalindrome("")
        assertTrue(result)
    }

    @Test
    fun testIsPalindrome_SingleCharacterPalindrome() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("a")
        assertTrue(result)
    }

    @Test
    fun testIsPalindrome_PalindromeString() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("radar")
        assertTrue(result)
    }

    @Test
    fun testIsPalindrome_NonPalindromeString() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("hello")
        assertFalse(result)
    }
}