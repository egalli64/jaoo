/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * String - Exercise 4
 * <p>
 * Remove a character
 */
class Exercise4Test {
    /**
     * Plain example
     */
    @Test
    void removeCharPlain() {
        String actual = Exercise4.removeChar("example", 5);
        String expected = "exampe";

        assertThat(actual).isEqualTo(expected);
    }

    /*
     * Add more tests ...!
     */
}
