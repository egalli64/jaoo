/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s05;

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
