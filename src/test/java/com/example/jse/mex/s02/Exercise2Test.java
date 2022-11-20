package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void distanceSquareTwo() {
        double actual = Exercise2.distance(1, 10, 2, 9);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, withPrecision(.000_001));
    }

    @Test
    void distanceZero() {
        double actual = Exercise2.distance(27, 42, 27, 42);
        double expected = 0.0;

        assertThat(actual).isEqualTo(expected);
    }
}
