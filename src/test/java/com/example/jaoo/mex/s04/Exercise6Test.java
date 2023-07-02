/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 6
 * <p>
 * Looping on digits
 */
class Exercise6Test {

    /**
     * 3 4 5 -> 9 16 25
     */
    @Test
    void squareDigitPlain() {
        long actual = Exercise6.squareDigit(345);
        long expected = 91625;

        assertThat(actual).isEqualTo(expected);
    }
}
