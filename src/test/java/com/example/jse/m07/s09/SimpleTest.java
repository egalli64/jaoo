/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s09;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import com.example.jse.m07.s06.Simple;

/**
 * Testing an exception-throwing method in the modern way - Jupiter + AssertJ
 */
class SimpleTest {
    @Test
    void negateMinInt() {
        Simple simple = new Simple();

        assertThatThrownBy(() -> simple.negate(Integer.MIN_VALUE)) //
                .isInstanceOf(IllegalArgumentException.class) //
                .hasMessage("Can't negate MIN_VALUE");
    }
}
