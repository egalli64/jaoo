package m04.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import m04.s04.Simple;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    public void init() {
        simple = new Simple();
    }

    @Test
    public void negatePositive() {
        int value = 42;
        int expected = -42;

        int result = simple.negate(value);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void negateNegative() {
        int value = -42;
        int expected = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void negateZero() {
        int value = 0;
        int expected = 0;

        int result = simple.negate(value);

        assertThat(result, equalTo(expected));
    }
}
