package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void singlePlain() {
        int[] data = { 1, 4, 2, 3, 3, 2, 1 };
        int actual = Exercise4.single(data);
        int expected = 4;

        assertThat(actual, is(expected));
    }
}
