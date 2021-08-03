package mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void evenSumPositive() {
        long actual = Exercise2.evenSum(1, 3);
        long expected = 2;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void evenSumNegPos() {
        long actual = Exercise2.evenSum(-3, 3);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void evenSumSingle() {
        long actual = Exercise2.evenSum(1002, 1002);
        long expected = 1002;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void evenSumEmpty() {
        long actual = Exercise2.evenSum(1003, 1002);
        long expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}
