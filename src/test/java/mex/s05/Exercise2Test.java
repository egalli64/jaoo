package mex.s05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void isPalindromePlain() {
        boolean actual = Exercise2.isPalindrome("abba");
        boolean expected = true;

        assertThat(actual, is(expected));
    }
}
