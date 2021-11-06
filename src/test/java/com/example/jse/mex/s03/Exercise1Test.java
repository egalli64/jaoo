package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void checkSignPositive() {
        String actual = Exercise1.checkSign(42);
        String expected = "positive";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkSignNegative() {
        String actual = Exercise1.checkSign(-42);
        String expected = "negative";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkSignZero() {
        String actual = Exercise1.checkSign(0);
        String expected = "zero";

        assertThat(actual).isEqualTo(expected);
    }
}
