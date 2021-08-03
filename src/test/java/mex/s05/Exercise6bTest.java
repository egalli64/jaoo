package mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise6bTest {
    @Test
    void binAddPlain() {
        String actual = Exercise6b.binAdd("1001", "1101");
        String expected = "10110";

        /*
         * 0001
         * 
         * 01001
         * 
         * 01101
         * 
         * -----
         * 
         * 10110
         */

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binarySumVerySimple() {
        String expected = "11";
        String actual = Exercise6b.binAdd("10", "01");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binarySumSimple() {
        String expected = "101";
        String actual = Exercise6b.binAdd("10", "11");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binarySum15x2() {
        String expected = "11110";
        String actual = Exercise6b.binAdd("1111", "1111");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binarySum15plus1() {
        String expected = "10000";
        String actual = Exercise6b.binAdd("1111", "0001");

        assertThat(actual).isEqualTo(expected);
    }
}
