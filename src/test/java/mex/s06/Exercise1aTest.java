package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise1aTest {
    @Test
    void reversePlain() {
        int[] input = new int[] { 1, 2, 3 };
        int[] actual = Exercise1a.reverse(input);
        int[] expected = new int[] { 3, 2, 1 };

        assertThat(actual, is(expected));
    }
}
