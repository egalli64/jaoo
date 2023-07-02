/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 5
 * <p>
 * Anagram
 */
class Exercise5Test {
    /**
     * Plain test
     */
    @Test
    void isAnagramPlain() {
        boolean actual = Exercise5.isAnagram("thing", "night");
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
