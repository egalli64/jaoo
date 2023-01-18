/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 8
 * <p>
 * Fibonacci
 */
class Exercise8Test {
    /**
     * 19 -> 4181
     */
    @Test
    void fibonacci19() {
        long actual = Exercise8.fibonacci(19);
        long expected = 4181;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * 83 -> 99_194_853_094_755_497
     */
    @Test
    void fibonacci83() {
        long actual = Exercise8.fibonacci(83);
        long expected = 99_194_853_094_755_497L;

        assertThat(actual).isEqualTo(expected);
    }
}
