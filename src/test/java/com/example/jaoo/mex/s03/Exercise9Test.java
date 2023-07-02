/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 9
 * <p>
 * Prime number checker
 */
class Exercise9Test {
    /**
     * Not prime
     */
    @Test
    void prime42() {
        boolean actual = Exercise9.isPrime(42);
        assertThat(actual).isFalse();
    }

    /**
     * Prime
     */
    @Test
    void primeTrue() {
        boolean actual = Exercise9.isPrime(1_073_676_287);
        assertThat(actual).isTrue();
    }
}
