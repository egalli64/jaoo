package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise6aTest {
    @Test
    void bin2decPlain() {
        int actual = Exercise6a.bin2dec("1001");
        int expected = 9;

        assertThat(actual, is(expected));
    }
}
