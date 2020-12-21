package mex.s04;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class Exercise6Test {

    @Test
    void squareDigitPlain() {
        long actual = Exercise6.squareDigit(345);
        long expected = 91625;

        assertThat(actual, is(expected));
    }
}
