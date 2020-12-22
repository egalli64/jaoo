package mex.s06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void averagePlain() {
        double actual = Exercise2.average(new int[] { 1, 2, 3 });
        double expected = 2.0;

        assertThat(actual, is(expected));
    }
}
