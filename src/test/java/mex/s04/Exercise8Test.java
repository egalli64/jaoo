package mex.s04;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class Exercise8Test {
    @Test
    void fibonacci19() {
        long actual = Exercise8.fibonacci(19);
        long expected = 4181;

        assertThat(actual, is(expected));
    }

    @Test
    void fibonacci83() {
        long actual = Exercise8.fibonacci(83);
        long expected = 99_194_853_094_755_497L;

        assertThat(actual, is(expected));
    }
}
