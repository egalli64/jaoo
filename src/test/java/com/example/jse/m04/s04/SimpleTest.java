/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A test case with a first actual test in it
 * 
 * @see Simple the class to be tested
 */
class SimpleTest {
    /**
     * The test is named as the tested method, plus an hint on its raison d'être.
     */
    @Test
    void negatePositive() {
        // 1. preparing the test
        Simple simple = new Simple();
        int value = 42;
        int expected = -42;

        // 2. execute the call to the actual method
        int actual = simple.negate(value);

        // 3. assert to ensure that expected is equal to the actual result
        assertEquals(expected, actual);
    }
}
