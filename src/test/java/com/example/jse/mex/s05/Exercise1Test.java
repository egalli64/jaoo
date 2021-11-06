package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void reverseStringPlain() {
        String actual = Exercise1.reverse("abc");
        String expected = "cba";

        assertThat(actual).isEqualTo(expected);
    }
}
