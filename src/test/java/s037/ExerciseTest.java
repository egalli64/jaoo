package s037;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import s037.Exercise;

class ExerciseTest {

    @Test
    void toUpperNull() {
        String result = Exercise.toUpper(null);
        
        Assertions.assertNull(result);
    }

    @Test
    void toUpperEmpty() {
        String result = Exercise.toUpper("");
        
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void toUpperBob() {
        String result = Exercise.toUpper("Bob");
        
        Assertions.assertEquals("BOB", result);
    }   
}
