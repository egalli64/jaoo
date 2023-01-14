/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Jupiter assertions
 */
class SimpleTest {
    /**
     * Assert that a condition is true
     */
    @Test
    void checkTrue() {
        boolean condition = isPositive(12);
        assertTrue(condition);
    }

    /**
     * Assert that a reference is null
     */
    @Test
    void checkNull() {
        String reference = nullIfPositive(42);
        assertNull(reference);
    }

    /**
     * Assert that two primitive values (integers) are equals
     */
    @Test
    void checkEquals() {
        int expected = 42;
        int actual = 42;
        assertEquals(expected, actual);
    }

    /**
     * Assert that two floating point primitive values (doubles) are close enough to
     * be considered equals.
     * <p>
     * With a lower delta the assertion should fail
     */
    @Test
    void checkEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertEquals(expected, actual, .000_000_000_000_000_2);
    }

    /**
     * Utility method to experiment on testing. Notice that it is _not_ annotated as
     * Test, so are ignored by JUnit
     * 
     * @param value an integer
     * @return true if the value is greater than zero
     */
    private boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Utility method to experiment on testing. Notice that it is _not_ annotated as
     * Test, so are ignored by JUnit
     * 
     * @param value an integer
     * @return null if the value is greater than zero
     */
    private String nullIfPositive(int value) {
        return value > 0 ? null : "not a null";
    }
}
