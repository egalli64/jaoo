package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise7Test {
    @Test
    void factorialFour() {
        long actual = Exercise7.factorial(4);
        long expected = 24;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void factorialNegative() {
        long actual = Exercise7.factorial(-4);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
