package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise8Test {
    @Test
    void fibonacci19() {
        long actual = Exercise8.fibonacci(19);
        long expected = 4181;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fibonacci83() {
        long actual = Exercise8.fibonacci(83);
        long expected = 99_194_853_094_755_497L;

        assertThat(actual).isEqualTo(expected);
    }
}
