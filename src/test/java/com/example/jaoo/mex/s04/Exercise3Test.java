/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Loop - Exercise 3
 * <p>
 * Array and String generation
 */
class Exercise3Test {
    /**
     * Three strings
     */
    @Test
    void pyramidPlain() {
        int input = 3;
        String[] actual = Exercise3.pyramid(input);

        assertThat(actual.length).isEqualTo(input);
        for (int i = 0; i < input; i++) {
            assertThat(actual[i]).matches(String.format("x{%d}", i + 1));
        }
    }
}
