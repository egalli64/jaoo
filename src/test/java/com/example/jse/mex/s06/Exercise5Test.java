/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Array - Exercise 5
 * <p>
 * Duplicated values
 */
class Exercise5Test {
    /**
     * Plain test
     */
    @Test
    void duplicatesPlain() {
        int[] data = { 1, 4, 2, 3, 3, 2, 1 };
        int[] actual = Exercise5.duplicates(data);
        Integer[] expected = { 1, 2, 3 };

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    /*
     * Add more tests ...!
     */
}
