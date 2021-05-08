package m04.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import m04.s04.Simple;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    void init() {
        simple = new Simple();
    }

    @Test
    void negatePositive() {
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertThat(actual, equalTo(expected));
    }

    @Test
    void negateNegative() {
        int value = -42;
        int expected = 42;

        int actual = simple.negate(value);

        assertThat(actual, equalTo(expected));
    }

    @Test
    void negateZero() {
        int value = 0;
        int expected = 0;

        int actual = simple.negate(value);

        assertThat(actual, equalTo(expected));
    }
}
