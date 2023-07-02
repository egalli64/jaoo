/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 2
 * <p>
 * From begin to end (included), but not all the elements
 */
class Exercise2Test {
    /**
     * 1, 2, 3 -> 2
     */
    @Test
    void evenSumPositive() {
        long actual = Exercise2.evenSum(1, 3);
        long expected = 2;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -3, -2, ..., 2, 3 -> 0
     */
    @Test
    void evenSumNegPos() {
        long actual = Exercise2.evenSum(-3, 3);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * single even element
     */
    @Test
    void evenSumSingle() {
        long actual = Exercise2.evenSum(1002, 1002);
        long expected = 1002;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * single odd element -> 0
     */
    @Test
    void oddSumSingle() {
        long actual = Exercise2.evenSum(1003, 1003);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * left bigger than right -> 0
     */
    @Test
    void evenSumEmpty() {
        long actual = Exercise2.evenSum(1003, 1002);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
