/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 6a
 * <p>
 * Character to integer
 */
class Exercise6aTest {
    /**
     * Plain test
     */
    @Test
    void bin2decPlain() {
        int actual = Exercise6a.bin2dec("1001");
        int expected = 9;

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
