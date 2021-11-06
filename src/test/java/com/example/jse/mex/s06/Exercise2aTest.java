package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise2aTest {
    @Test
    void averagePlain() {
        double actual = Exercise2a.average(new int[] { 1, 2, 3 });
        double expected = 2.0;

        assertThat(actual).isEqualTo(expected);
    }
}
