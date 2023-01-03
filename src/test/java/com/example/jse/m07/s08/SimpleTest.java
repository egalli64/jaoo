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
 * Testing an exception-throwing method in the modern way - plain Jupiter
 */
class SimpleTest {
    @Test
    void negateMinInt() {
        Simple simple = new Simple();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, //
                () -> simple.negate(Integer.MIN_VALUE));
        assertEquals("Can't negate MIN_VALUE", ex.getMessage());
    }
}
