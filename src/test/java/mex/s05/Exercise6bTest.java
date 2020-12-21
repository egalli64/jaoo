package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise6bTest {
    @Test
    void binAddPlain() {
        String actual = Exercise6b.binAdd("1001", "1101");
        String expected = "10110";

        assertThat(actual, is(expected));
    }
}
