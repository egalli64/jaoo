package m04.s04;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void negatePositive() {
        Simple simple = new Simple();
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertThat(actual, equalTo(expected));
    }
}
