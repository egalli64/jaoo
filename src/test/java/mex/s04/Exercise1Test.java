package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void sumPositive() {
        long actual = Exercise1.sum(1, 3);
        long expected = 6;

        assertThat(actual, is(expected));
    }

    @Test
    void sumNegPos() {
        long actual = Exercise1.sum(-3, 3);
        long expected = 0;

        assertThat(actual, is(expected));
    }

    @Test
    void sumSingle() {
        long actual = Exercise1.sum(1003, 1003);
        long expected = 1003;

        assertThat(actual, is(expected));
    }

    @Test
    void sumEmpty() {
        long actual = Exercise1.sum(1003, 1002);
        long expected = 0;

        assertThat(actual, is(expected));
    }
}
