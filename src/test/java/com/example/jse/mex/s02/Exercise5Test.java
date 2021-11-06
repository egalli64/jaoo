package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void scoreTenPlain() {
        int actual = Exercise5.score(0.1, -0.1);
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scoreTenLimit() {
        int actual = Exercise5.score(0.0, 1.0);
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scoreTenLimit2() {
        int actual = Exercise5.score(Math.sqrt(0.6), Math.sqrt(0.4));
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scoreFiveLimit() {
        double pos = Math.sqrt(25.0 / 2);
        int actual = Exercise5.score(pos, pos);
        int expected = 5;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scoreOne() {
        int actual = Exercise5.score(3.55, 3.55);
        int expected = 1;

        assertThat(actual).isEqualTo(expected);
    }
}
