/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 2
 * <p>
 * True or false
 */
class Exercise2Test {
    /**
     * An odd value
     */
    @Test
    void isOddTrue() {
        boolean actual = Exercise2.isOdd(19);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * A (negative) even value
     */
    @Test
    void isOddFalse() {
        boolean actual = Exercise2.isOdd(-12);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }
}
