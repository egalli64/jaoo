package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void evenSumPositive() {
        long actual = Exercise2.evenSum(1, 3);
        long expected = 2;

        assertThat(actual, is(expected));
    }

    @Test
    void evenSumNegPos() {
        long actual = Exercise2.evenSum(-3, 3);
        long expected = 0;

        assertThat(actual, is(expected));
    }

    @Test
    void evenSumSingle() {
        long actual = Exercise2.evenSum(1002, 1002);
        long expected = 1002;

        assertThat(actual, is(expected));
    }

    @Test
    void evenSumEmpty() {
        long actual = Exercise2.evenSum(1003, 1002);
        long expected = 0;

        assertThat(actual, is(expected));
    }
}
