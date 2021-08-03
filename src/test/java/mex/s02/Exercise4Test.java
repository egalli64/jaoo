package mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void testZeroCelsius() {
        double actual = Exercise4.toFahrenhein(0);
        double expected = 32;

        assertThat(actual).isEqualTo(expected, withPrecision(6d));
    }

    @Test
    void testZeroFahrenheit() {
        double actual = Exercise4.toFahrenhein(-17.777_778);
        double expected = 0;

        assertThat(actual).isEqualTo(expected, withPrecision(6d));
    }
}
