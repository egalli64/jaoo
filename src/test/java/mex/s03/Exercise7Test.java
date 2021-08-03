package mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise7Test {
    @Test
    void fizzBuzzPlain() {
        String actual = Exercise7.fizzBuzz(52);
        String expected = "52";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzMultiple3() {
        String actual = Exercise7.fizzBuzz(42);
        String expected = "Fizz";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzMultiple5() {
        String actual = Exercise7.fizzBuzz(25);
        String expected = "Buzz";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzMultiple15() {
        String actual = Exercise7.fizzBuzz(90);
        String expected = "FizzBuzz";

        assertThat(actual).isEqualTo(expected);
    }
}
