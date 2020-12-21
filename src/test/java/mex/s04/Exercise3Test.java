package mex.s04;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.MatchesPattern.matchesPattern;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void pyramidPlain() {
        int input = 3;
        String[] actual = Exercise3.pyramid(input);

        assertThat(actual.length, is(input));
        for (int i = 0; i < input; i++) {
            assertThat(actual[i], matchesPattern(String.format("x{%d}", i + 1)));
        }
    }
}
