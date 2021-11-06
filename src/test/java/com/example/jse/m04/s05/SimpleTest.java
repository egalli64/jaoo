package com.example.jse.m04.s05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.jse.m04.s04.Simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    void init() {
        simple = new Simple();
    }

    @Test
    void negatePositive() {
        int value = 42;
        int expected = -42;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }

    @Test
    void negateNegative() {
        int value = -42;
        int expected = 42;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }

    @Test
    void negateZero() {
        int value = 0;
        int expected = 0;

        int actual = simple.negate(value);

        assertEquals(expected, actual);
    }
}
