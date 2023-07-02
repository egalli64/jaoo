/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Array - Exercise 4
 * <p>
 * Non duplicated value
 */
class Exercise4Test {
    /**
     * A plain test
     */
    @Test
    void singlePlain() {
        int[] data = { 1, 4, 2, 3, 3, 2, 1 };
        int actual = Exercise4.single(data);
        int expected = 4;

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
