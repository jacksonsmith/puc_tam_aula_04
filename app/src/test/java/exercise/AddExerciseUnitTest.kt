package exercise

import com.example.myapplication.exercies.AddExercise
import org.junit.Assert
import org.junit.Test

class AddExerciseUnitTest {

    @Test
    fun addition_zero_plus_zero_isCorrect() {
        val exercise = AddExercise();
        Assert.assertEquals(exercise.add(0,0), 0)
    }

    @Test
    fun addition_zero_plus_two_isCorrect() {
        val exercise = AddExercise();
        Assert.assertEquals(exercise.add(0,2), 2)
    }

}