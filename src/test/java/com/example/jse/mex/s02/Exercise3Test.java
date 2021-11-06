package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void engineCapacityPlain() {
        double actual = Exercise3.engineCapacity(74, 75, 4);
        double expected = 1290.252;

        assertThat(actual).isEqualTo(expected, withPrecision(3d));
    }
}
