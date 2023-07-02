/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 3
 * <p>
 * Eleven possible outcomes - ten punctual check, one for all the other values
 */
class Exercise3Test {
    /**
     * 0 - left limit
     */
    @Test
    void asWordZero() {
        String actual = Exercise3.asWord(0);
        String expected = "zero";

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Out of bounds (right)
     */
    @Test
    void asWordOther() {
        String actual = Exercise3.asWord(42);
        String expected = "other";

        assertThat(actual).isEqualTo(expected);
    }
}
