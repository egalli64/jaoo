/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 5
 * <p>
 * Looping on digits
 */
class Exercise5Test {
    /**
     * 123 -> 6
     */
    @Test
    void digitSumPositive() {
        int actual = Exercise5.digitSum(123);
        int expected = 6;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * 0 -> 0
     */
    @Test
    void digitSumZero() {
        int actual = Exercise5.digitSum(0);
        int expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -123 -> 6
     */
    @Test
    void digitSumNegative() {
        int actual = Exercise5.digitSum(-123);
        int expected = 6;

        assertThat(actual).isEqualTo(expected);
    }
}
