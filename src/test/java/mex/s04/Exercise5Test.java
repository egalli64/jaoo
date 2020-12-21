package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void digitSumPositive() {
        int actual = Exercise5.digitSum(123);
        int expected = 6;

        assertThat(actual, is(expected));
    }

    @Test
    void digitSumZero() {
        int actual = Exercise5.digitSum(0);
        int expected = 0;

        assertThat(actual, is(expected));
    }

    @Test
    void digitSumNegative() {
        int actual = Exercise5.digitSum(-123);
        int expected = 6;

        assertThat(actual, is(expected));
    }
}
