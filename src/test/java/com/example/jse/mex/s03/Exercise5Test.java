/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 5
 * <p>
 * Values in ranges
 */
class Exercise5Test {
    /**
     * Lucky A
     */
    @Test
    void voteLowA() {
        char actual = Exercise5.vote(90.01);
        char expected = 'A';

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Unlucky B
     */
    @Test
    void voteTopB() {
        char actual = Exercise5.vote(90);
        char expected = 'B';

        assertThat(actual).isEqualTo(expected);
    }
}
