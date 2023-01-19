/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Array - Exercise 3
 * <p>
 * Max value
 */
class Exercise3Test {
    /**
     * A plain test
     */
    @Test
    void maxPlain() {
        int[] input = { 2, 3, 1 };
        int actual = Exercise3.max(input);
        int expected = 3;

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
