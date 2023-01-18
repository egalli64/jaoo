/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 1
 * <p>
 * All elements from begin to end (included)
 */
class Exercise1Test {
    /**
     * 1, 2, 3 -> 6
     */
    @Test
    void sumPositive() {
        long actual = Exercise1.sum(1, 3);
        long expected = 6;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -3, -2, ..., 2, 3 -> 0
     */
    @Test
    void sumNegPos() {
        long actual = Exercise1.sum(-3, 3);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * single element
     */
    @Test
    void sumSingle() {
        long actual = Exercise1.sum(1003, 1003);
        long expected = 1003;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * left bigger than right -> 0
     */
    @Test
    void sumEmpty() {
        long actual = Exercise1.sum(1003, 1002);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
