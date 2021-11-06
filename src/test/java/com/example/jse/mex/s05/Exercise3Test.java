package com.example.jse.mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test   
    void removeVowelsPlain() {
        String actual = Exercise3.removeVowels("example");
        String expected = "xmpl";

        assertThat(actual).isEqualTo(expected);
    }
}
