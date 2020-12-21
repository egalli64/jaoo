package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise7Test {
    @Test
    void factorialFour() {
        long actual = Exercise7.factorial(4);
        long expected = 24;

        assertThat(actual, is(expected));
    }

    @Test
    void factorialNegative() {
        long actual = Exercise7.factorial(-4);
        long expected = 0;

        assertThat(actual, is(expected));
    }
}
