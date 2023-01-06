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
 * Operators - Exercise 3
 * 
 * The volume of a cylinder is PI * squared radius * height
 */
class Exercise3Test {
    @Test
    void displacementMini1000() {
        double actual = Exercise3.displacement(64.59, 76.20, 4);
        double expected = 998.7;

        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }
}
