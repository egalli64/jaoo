package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void isPalindromePlain() {
        boolean actual = Exercise2.isPalindrome("abba");
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }
}
