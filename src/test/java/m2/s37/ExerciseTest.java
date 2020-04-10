package m2.s37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
