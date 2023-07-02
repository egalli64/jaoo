/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Array - Exercise 2b
 * <p>
 * Median
 */
class Exercise2bTest {
    /**
     * A plain test
     */
    @Test
    void averagePlain() {
        double actual = Exercise2b.median(new int[] { 1, 2, 3 });
        double expected = 2.0;

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
