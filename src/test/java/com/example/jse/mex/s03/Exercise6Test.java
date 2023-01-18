/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 6
 * <p>
 * Leap Year
 */
class Exercise6Test {
    /**
     * 2020
     */
    @Test
    void isLeapTrue() {
        boolean actual = Exercise6.isLeapYear(2020);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * 1900
     */
    @Test
    void isLeapFalse() {
        boolean actual = Exercise6.isLeapYear(1900);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }
}
