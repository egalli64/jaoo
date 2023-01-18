/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 8
 * <p>
 * Comparison among a few values
 */
class Exercise8Test {
    /**
     * Reverted
     */
    @Test
    void sortPlain() {
        int[] expected = { 1, 2, 3 };
        int[] actual = Exercise8.sort(expected[2], expected[1], expected[0]);

        assertThat(actual).isEqualTo(expected);
    }
}
