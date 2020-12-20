package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise6Test {
    @Test
    void isLeapTrue() {
        boolean actual = Exercise6.isLeapYear(2020);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

    @Test
    void isLeapFalse() {
        boolean actual = Exercise6.isLeapYear(1900);
        boolean expected = false;

        assertThat(actual, is(expected));
    }
}
