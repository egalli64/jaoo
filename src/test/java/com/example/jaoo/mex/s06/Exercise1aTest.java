/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Array - Exercise 1a
 * <p>
 * Reverse array
 */
class Exercise1aTest {
    /**
     * A plain test
     */
    @Test
    void reversePlain() {
        int[] input = new int[] { 1, 2, 3 };
        int[] actual = Exercise1a.reverse(input);
        int[] expected = new int[] { 3, 2, 1 };

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
