package com.example.jse.m07.s08;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.jse.m07.s06.Simple;

class SimpleTest {
    @Test
    void negateMinInt() {
        var simple = new Simple();

        var exc = assertThrows(IllegalArgumentException.class, () -> simple.negate(Integer.MIN_VALUE));
        assertThat(exc.getMessage()).isEqualTo("Can't negate MIN_VALUE");
    }
}
