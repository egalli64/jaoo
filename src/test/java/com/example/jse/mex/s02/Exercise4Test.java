/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

/**
 * Operators - Exercise 4
 * 
 * Get Fahrenhein from Celsius
 */
class Exercise4Test {
    /**
     * 0.0 Celsius is exactly 32.0 Fahrenhein
     */
    @Test
    void testZeroCelsius() {
        final double celsius = 0.0;
        final double actual = Exercise4.toFahrenhein(celsius);
        final double expected = 32.0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -40.0 Celsius is exactly -40.0 Fahrenhein
     */
    @Test
    void testMinus40Celsius() {
        final double celsius = -40.0;
        final double actual = Exercise4.toFahrenhein(celsius);
        final double expected = -40.0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * 0.0 Fahrenhein is pretty close to -17.777_777 Celsius
     */
    @Test
    void testZeroFahrenheit() {
        final double celsius = -17.777_777;
        final double actual = Exercise4.toFahrenhein(celsius);
        final double expected = 0;

        assertThat(actual).isEqualTo(expected, withPrecision(0.000_002));
    }
}
