package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void sumPositive() {
        long actual = Exercise1.sum(1, 3);
        long expected = 6;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sumNegPos() {
        long actual = Exercise1.sum(-3, 3);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sumSingle() {
        long actual = Exercise1.sum(1003, 1003);
        long expected = 1003;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sumEmpty() {
        long actual = Exercise1.sum(1003, 1002);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
