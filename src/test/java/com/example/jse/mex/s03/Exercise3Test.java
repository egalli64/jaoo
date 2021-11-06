package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void asWordZero() {
        String actual = Exercise3.asWord(0);
        String expected = "zero";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void asWordOther() {
        String actual = Exercise3.asWord(42);
        String expected = "other";

        assertThat(actual).isEqualTo(expected);
    }
}
