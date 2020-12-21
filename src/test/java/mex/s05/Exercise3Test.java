package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void removeVowelsPlain() {
        String actual = Exercise3.removeVowels("example");
        String expected = "xmpl";

        assertThat(actual, is(expected));
    }
}
