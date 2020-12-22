package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void maxPlain() {
        int[] input = { 2, 3, 1 };
        int actual = Exercise3.max(input);
        int expected = 3;

        assertThat(actual, is(expected));
    }

    @Test
    void maxNull() {
        int[] input = null;
        int actual = Exercise3.max(input);
        // when you know about exceptions, refactor the code accordingly
        int expected = Integer.MIN_VALUE;

        assertThat(actual, is(expected));
    }
}
