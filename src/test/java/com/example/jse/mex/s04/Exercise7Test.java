/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 7
 * <p>
 * Factorial
 */
class Exercise7Test {
    /**
     * 4! = 4 * 3 * 2
     */
    @Test
    void factorialFour() {
        long actual = Exercise7.factorial(4);
        long expected = 24;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -4 -> 0
     */
    @Test
    void factorialNegative() {
        long actual = Exercise7.factorial(-4);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
