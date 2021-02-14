package m04.s04;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    public void negatePositive() {
        Simple simple = new Simple();
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertThat(actual, equalTo(expected));
    }
}
