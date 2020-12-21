package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void reverseStringPlain() {
        String actual = Exercise1.reverse("abc");
        String expected = "cba";

        assertThat(actual, is(expected));
    }
}
