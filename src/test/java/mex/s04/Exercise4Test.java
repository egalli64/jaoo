package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void sqrt2() {
        double actual = Exercise4.sqrt(2);
        double expected = Math.sqrt(2);

        assertThat(actual, closeTo(expected, 0.000_000_001));
    }

    @Test
    void sqrtEpsilon() {
        double epsilon = 0.001;
        double actual = Exercise4.sqrt(2, epsilon);
        double expected = Math.sqrt(2);

        assertThat(actual, closeTo(expected, epsilon * epsilon));
    }
}
