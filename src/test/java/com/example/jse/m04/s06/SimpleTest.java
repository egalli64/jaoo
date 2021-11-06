package com.example.jse.m04.s06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void checkTrue() {
        boolean condition = isPositive(12);
        assertTrue(condition);
    }

    @Test
    void checkNull() {
        String reference = nullIfPositive(42);
        assertNull(reference);
    }

    @Test
    void checkEquals() {
        int expected = 42;
        int actual = 42;
        assertEquals(expected, actual);
    }

    @Test
    void checkEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertEquals(expected, actual, .0001);
    }

    private boolean isPositive(int value) {
        return value > 0;
    }

    private String nullIfPositive(int value) {
        return value > 0 ? null : "not a null";
    }
}
