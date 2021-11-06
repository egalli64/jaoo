package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void isOddTrue() {
        boolean actual = Exercise2.isOdd(19);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isOddFalse() {
        boolean actual = Exercise2.isOdd(-12);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Disabled("enable it for an exception throwing version")
    void isOddZero() {
        // check on exception!
        try {
            Exercise2.isOdd(0);
            fail("Exception expected!");
        } catch (IllegalArgumentException iae) {
            assertThat(iae.getMessage()).isEqualTo("Zero is not even nor odd!");
        }
    }
}
