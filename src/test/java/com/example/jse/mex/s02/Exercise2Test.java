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
 * Operators - Exercise 2
 * 
 * Pythagorean theorem: requires square and square root
 */
class Exercise2Test {
    /**
     * Distance between (1, 10) and (2, 9) is square root of 2
     */
    @Test
    void distanceSquareTwo() {
        double actual = Exercise2.distance(1, 10, 2, 9);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, withPrecision(.000_001));
    }

    /**
     * Distance between the same point is exactly zero
     */
    @Test
    void distanceZero() {
        double actual = Exercise2.distance(27, 42, 27, 42);
        double expected = 0.0;

        assertThat(actual).isEqualTo(expected);
    }
}
