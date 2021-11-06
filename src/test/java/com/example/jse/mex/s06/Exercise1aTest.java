package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise1aTest {
    @Test
    void reversePlain() {
        int[] input = new int[] { 1, 2, 3 };
        int[] actual = Exercise1a.reverse(input);
        int[] expected = new int[] { 3, 2, 1 };

        assertThat(actual).isEqualTo(expected);
    }
}
