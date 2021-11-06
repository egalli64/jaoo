package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void duplicatesPlain() {
        int[] data = { 1, 4, 2, 3, 3, 2, 1 };
        int[] actual = Exercise5.duplicates(data);
        Integer[] expected = { 1, 2, 3 };

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
