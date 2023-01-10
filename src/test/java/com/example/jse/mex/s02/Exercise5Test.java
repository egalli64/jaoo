/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Operators - Exercise 5
 * 
 * Comparison between distances (Pythagorean theorem)
 */
class Exercise5Test {
    /**
     * Close to the center, max points
     */
    @Test
    void scoreTenPlain() {
        int actual = Exercise5.score(0.1, -0.1);
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * On the inner ring
     */
    @Test
    void scoreTenFiveLimit() {
        int actual = Exercise5.score(0.0, 1.0);
        int expected = 5;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Just inside the inner ring
     */
    @Test
    void scoreTenCloseToTheLimit() {
        int actual = Exercise5.score(0.0, 0.999_999);
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Again right on the inner ring
     */
    @Test
    void scoreTenFiveLimit2() {
        int actual = Exercise5.score(Math.sqrt(0.6), Math.sqrt(0.4));
        int expected = 5;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * On the second ring
     */
    @Test
    void scoreFiveOneLimit() {
        double pos = Math.sqrt(25.0 / 2);
        int actual = Exercise5.score(pos, pos);
        int expected = 1;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Out the second ring
     */
    @Test
    void scoreOne() {
        int actual = Exercise5.score(3.55, 3.55);
        int expected = 1;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Missing the target
     */
    @Test
    void scoreZero() {
        int actual = Exercise5.score(7.2, 7.2);
        int expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
