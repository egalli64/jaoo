/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s06;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for Simple::negate()
 */
class SimpleTest {
    private Simple simple;

    /**
     * Initialize the simple object before each test
     */
    @BeforeEach
    void init() {
        this.simple = new Simple();
    }

    /**
     * Negate max integer value
     */
    @Test
    void negateMaxValue() {

        int value = Integer.MAX_VALUE;
        int expected = -Integer.MAX_VALUE;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Negate zero (is again zero)
     */
    @Test
    void negateZero() {
        int value = 0;
        int expected = 0;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Negate a positive number
     */
    @Test
    void negatePositive() {
        int value = 42;
        int expected = -42;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Negate a negative number
     */
    @Test
    void negateNegative() {
        int value = -25;
        int expected = 25;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Can't negate minimum integer value - classic test
     */
    @Test
    void negateException() {
        try {
            int actual = simple.negate(Integer.MIN_VALUE);
            fail("An IllegalArgumentException was expected, instead I've got " + actual);
        } catch (IllegalArgumentException iae) {
            String message = iae.getMessage();
            assertThat(message).isEqualTo("Can't negate MIN_VALUE");
        }
    }

    /**
     * Can't negate minimum integer value - alternative classic test
     */
    @Test
    void negateExceptionAlternative() {
        try {
            simple.negate(Integer.MIN_VALUE);
        } catch (IllegalArgumentException iae) {
            String message = iae.getMessage();
            assertThat(message).isEqualTo("Can't negate MIN_VALUE");
            return;
        }
        fail("An IllegalArgumentException was expected");
    }
}
