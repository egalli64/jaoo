package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise6Test {
    @Test
    void mergePlain() {
        int[] left = { 1, 3, 5, 7 };
        int[] right = { 2, 4, 6 };
        int[] actual = Exercise6.merge(left, right);
        int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

        assertThat(actual).isEqualTo(expected);
    }
}
