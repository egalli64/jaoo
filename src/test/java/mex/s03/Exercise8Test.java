package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise8Test {
    @Test
    void sortPlain() {
        int[] expected = { 1, 2, 3 };
        int[] actual = Exercise8.sort(3, 2, 1);

        assertThat(actual, is(expected));
    }
}
