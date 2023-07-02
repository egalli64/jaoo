/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 1
 * <p>
 * One out of three
 */
class Exercise1Test {
    /**
     * A positive number
     */
    @Test
    void checkSignPositive() {
        String actual = Exercise1.checkSign(42);
        String expected = "positive";

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * A negative number
     */
    @Test
    void checkSignNegative() {
        String actual = Exercise1.checkSign(-42);
        String expected = "negative";

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Zero
     */
    @Test
    void checkSignZero() {
        String actual = Exercise1.checkSign(0);
        String expected = "zero";

        assertThat(actual).isEqualTo(expected);
    }
}
