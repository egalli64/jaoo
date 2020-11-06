package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03FizzBuzzTest {

    @Test
    void fizzBuzzPlain() {
        String actual = S03.fizzBuzz(52);

        assertThat(actual, is("52"));
    }

    @Test
    void fizzBuzzM3() {
        String actual = S03.fizzBuzz(42);

        assertThat(actual, is("Fizz"));
    }

    @Test
    void fizzBuzzM5() {
        String actual = S03.fizzBuzz(25);

        assertThat(actual, is("Buzz"));
    }

    @Test
    void fizzBuzzM3x5() {
        String actual = S03.fizzBuzz(90);

        assertThat(actual, is("FizzBuzz"));
    }
}
