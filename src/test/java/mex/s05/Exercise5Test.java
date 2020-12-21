package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void isAnagramPlain() {
        boolean actual = Exercise5.isAnagram("thing", "night");
        boolean expected = true;

        assertThat(actual, is(expected));
    }
}
