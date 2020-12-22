package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.in;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void duplicatesPlain() {
        int[] data = { 1, 4, 2, 3, 3, 2, 1 };
        int[] actual = Exercise5.duplicates(data);
        Integer[] expected = { 1, 2, 3 };

        assertThat(actual.length, is(expected.length));
        for (int value : actual) {
            assertThat(value, in(expected));
        }
    }
}
