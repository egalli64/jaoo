package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void asWordZero() {
        String actual = Exercise3.asWord(0);
        String expected = "zero";

        assertThat(actual, is(expected));
    }

    @Test
    void asWordOther() {
        String actual = Exercise3.asWord(42);
        String expected = "other";

        assertThat(actual, is(expected));
    }
}
