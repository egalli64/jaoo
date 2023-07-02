/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 4
 * <p>
 * Square root by Newton's method
 */
class Exercise4Test {
    /**
     * Square root of 2
     */
    @Test
    void sqrt2() {
        double actual = Exercise4.sqrt(2);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, withPrecision(.000_001));
    }

    /**
     * Square root of 2, with given epsilon
     */
    @Test
    void sqrtEpsilon() {
        double epsilon = 0.001;
        double actual = Exercise4.sqrt(2, epsilon);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, byLessThan(epsilon * epsilon));
    }
}
