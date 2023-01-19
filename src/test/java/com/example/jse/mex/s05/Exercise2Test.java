/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 2
 * <p>
 * Palindrome
 */
class Exercise2Test {
    /**
     * Positive test
     */
    @Test
    void isPalindromePlain() {
        boolean actual = Exercise2.isPalindrome("abba");
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }
    
    /*
     * Add more tests ...!
     */
}
