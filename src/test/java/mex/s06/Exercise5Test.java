package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void mergePlain() {
        int[] left = { 1, 3, 5, 7 };
        int[] right = { 2, 4, 6 };
        int[] actual = Exercise5.merge(left, right);
        int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

        assertThat(actual, is(expected));
    }
}
