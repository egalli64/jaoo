package m1.s25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest2 {
    @Test
    void negatePlain() {
        Simple simple = new Simple();
        int value = 42;
        int expected = -42;
        
        int actual = simple.negate(value);
        
        assertEquals(expected, actual);        
    }
}
