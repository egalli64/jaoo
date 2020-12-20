package mex.s02;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void engineCapacityPlain() {
        double actual = Exercise3.engineCapacity(74, 75, 4);
        double expected = 1290.252;

        assertThat(actual, closeTo(expected, 0.001));
    }
}
