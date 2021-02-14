package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    void isOddZero() {
        // check on exception!
        try {
            Exercise2.isOdd(0);
            fail("Exception expected!");
        } catch (IllegalArgumentException iae) {
            assertThat(iae.getMessage(), is("Zero is not even nor odd!"));
        }
    }
}
