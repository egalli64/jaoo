/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 9
 * <p>
 * Multiplication table
 */
class Exercise9Test {
    /**
     * 0 -> empty table
     */
    @Test
    void multiplicationTableZero() {
        int[][] expected = {};
        int[][] actual = Exercise9.multiplicationTable(0);

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * 3 -> ...
     */
    @Test
    void multiplicationTableThree() {
        int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        int[][] actual = Exercise9.multiplicationTable(3);

        assertThat(actual).isEqualTo(expected);
    }
}
