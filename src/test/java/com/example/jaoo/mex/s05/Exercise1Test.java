/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 1
 * <p>
 * Reverse a string
 */
class Exercise1Test {
    /**
     * Reversing a string with odd length
     */
    @Test
    void reverseStringPlain() {
        String actual = Exercise1.reverse("abc");
        String expected = "cba";

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
