/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 3
 * <p>
 * Remove vowels
 */
class Exercise3Test {
    /**
     * Plain test
     */
    @Test
    void removeVowelsPlain() {
        String actual = Exercise3.removeVowels("example");
        String expected = "xmpl";

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
