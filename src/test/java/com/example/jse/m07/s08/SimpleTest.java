/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.jse.m07.s06.Simple;

/**
 * Test case for Simple::negate() on minimum integer value with Jupiter
 * assertThrows()
 */
class SimpleTest {
    /**
     * Can't negate minimum integer value
     */
    @Test
    void negateMinInt() {
        Simple simple = new Simple();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, //
                () -> simple.negate(Integer.MIN_VALUE));
        assertEquals("Can't negate MIN_VALUE", ex.getMessage());
    }
}
