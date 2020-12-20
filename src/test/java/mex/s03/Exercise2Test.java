package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void isOddTrue() {
        boolean actual = Exercise2.isOdd(19);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

    @Test
    void isOddFalse() {
        boolean actual = Exercise2.isOdd(-12);
        boolean expected = false;

        assertThat(actual, is(expected));
    }
}
