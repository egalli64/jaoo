package m04.s04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void negatePositive() {
        Simple simple = new Simple();
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }
}
