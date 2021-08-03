package mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise6Test {
    @Test
    void isLeapTrue() {
        boolean actual = Exercise6.isLeapYear(2020);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isLeapFalse() {
        boolean actual = Exercise6.isLeapYear(1900);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }
}
