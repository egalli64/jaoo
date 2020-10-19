package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S04FactorialTest {
    @Test
    void factorialFour() {
        long actual = S04.factorial(4);

        assertThat(actual, is(24L));
    }

    @Test
    void factorialNegative() {
        long actual = S04.factorial(-4);

        assertThat(actual, is(0L));
    }
}
