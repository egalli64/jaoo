package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise9Test {
    @Test
    void prime42() {
        boolean actual = Exercise9.isPrime(42);
        boolean expected = false;

        assertThat(actual, is(expected));
    }

    @Test
    void primeTrue() {
        boolean actual = Exercise9.isPrime(1_073_676_287);
        boolean expected = true;

        assertThat(actual, is(expected));
    }
}
