package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise1bTest {
    @Test
    void reversePlain() {
        int[] actual = new int[] { 1, 2, 3 };
        Exercise1b.reverse(actual);
        int[] expected = new int[] { 3, 2, 1 };

        assertThat(actual, is(expected));
    }
}
