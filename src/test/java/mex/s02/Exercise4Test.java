package mex.s02;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void testZeroCelsius() {
        double actual = Exercise4.toFahrenhein(0);
        double expected = 32;

        assertThat(actual, closeTo(expected, 0.000_001));
    }

    @Test
    void testZeroFahrenheit() {
        double actual = Exercise4.toFahrenhein(-17.777_778);
        double expected = 0;

        assertThat(actual, closeTo(expected, 0.000_001));
    }
}
