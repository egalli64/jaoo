package com.example.jse.m04.s07;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

class SomethingElseTest {
    @Test
    void ajTrue() {
        boolean actual = isPositive(42);
        assertThat(actual).isTrue();
    }

    @Test
    void ajEqTrue() {
        boolean actual = isPositive(42);
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void ajNull() {
        String actual = nullIfPositive(12);
        assertThat(actual).isNull();
    }

    @Test
    void ajEqNull() {
        String actual = nullIfPositive(42);
        assertThat(actual).isEqualTo(null);
    }

    @Test
    void ajEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ajDoubleClose() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual).isCloseTo(expected, withPrecision(.000_001));
    }

    @Test
    void ajDoubleNotClose() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual).isNotCloseTo(expected, withPrecision(.000_000_000_000_000_1));
    }

    @Test
    void ajStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual).startsWith(prefix);
    }

    @Test
    void ajNotStart() {
        String prefix = "Bob";
        String actual = "Tom Jones";
        assertThat(actual).doesNotStartWith(prefix);
    }

    private boolean isPositive(int value) {
        return value > 0;
    }

    private String nullIfPositive(int value) {
        return value > 0 ? null : "not a null";
    }
}
