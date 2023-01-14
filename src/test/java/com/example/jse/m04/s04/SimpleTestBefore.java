/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A test case with a few tests, and even a common part for test preparation
 * 
 * @see Simple the class to be tested
 */
class SimpleTestBefore {
    /**
     * The simple object on which the tests are performed, initialized by the
     * beforeEach method
     */
    private Simple simple;

    /**
     * Initialize the simple object. Each test run on its fresh copy
     */
    @BeforeEach
    void init() {
        simple = new Simple();
    }

    /**
     * Test for the negate() method, passing a positive argument.
     */
    @Test
    void negatePositive() {
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }

    /**
     * Test for the negate() method, passing a negative argument.
     */
    @Test
    void negateNegative() {
        int value = -42;
        int expected = 42;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }

    /**
     * Test for the negate() method, passing zero as an argument.
     */
    @Test
    void negateZero() {
        int value = 0;
        int expected = 0;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }
}
