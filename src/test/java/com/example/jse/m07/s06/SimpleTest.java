package com.example.jse.m07.s06;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void negateZero() {
        Simple simple = new Simple();

        int value = 0;
        int expected = 0;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void negatePositive() {
        Simple simple = new Simple();

        int value = 42;
        int expected = -42;

        int result = simple.negate(value);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void negateException() {
        Simple simple = new Simple();

        try {
            int actual = simple.negate(Integer.MIN_VALUE);
            fail("An IllegalArgumentException was expected, instead I've got " + actual);
        } catch (IllegalArgumentException iae) {
            String message = iae.getMessage();
            assertThat(message).isEqualTo("Can't negate MIN_VALUE");
        }
    }

    @Test
    void negateExceptionAlternative() {
        Simple simple = new Simple();

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
