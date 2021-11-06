package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise9Test {
    @Test
    void prime42() {
        boolean actual = Exercise9.isPrime(42);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void primeTrue() {
        boolean actual = Exercise9.isPrime(1_073_676_287);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }
}
