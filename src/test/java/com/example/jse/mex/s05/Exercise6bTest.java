/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 6b
 * <p>
 * Character to integer
 */
class Exercise6bTest {
    /**
     * A plain test
     * 
     * <pre>
     * 00010 - Carry
     * 01001 - First operand
     * 01101 - Second operand
     * -----
     * 10110 - Result
     * </pre>
     */
    @Test
    void binAddPlain() {
        String actual = Exercise6b.binAdd("1001", "1101");
        String expected = "10110";

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * A very easy one
     */
    @Test
    void binarySumVerySimple() {
        String expected = "11";
        String actual = Exercise6b.binAdd("10", "01");

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Result is one character more than operands, due to carry
     */
    @Test
    void binarySumSimple() {
        String expected = "101";
        String actual = Exercise6b.binAdd("10", "11");

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Lot of carries
     */
    @Test
    void binarySum15x2() {
        String expected = "11110";
        String actual = Exercise6b.binAdd("1111", "1111");

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Chained carries
     */
    @Test
    void binarySum15plus1() {
        String expected = "10000";
        String actual = Exercise6b.binAdd("1111", "0001");

        assertThat(actual).isEqualTo(expected);
    }
}
