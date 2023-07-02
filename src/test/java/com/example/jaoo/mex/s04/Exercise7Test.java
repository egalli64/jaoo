/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

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
