package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void removeCharPlain() {
        String actual = Exercise4.removeChar("example", 5);
        String expected = "exampe";

        assertThat(actual, is(expected));
    }
}
