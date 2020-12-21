package mex.s04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise9Test {
    @Test
    void multiplicationTableZero() {
        int[][] expected = {};
        int[][] actual = Exercise9.multiplicationTable(0);

        assertThat(actual, is(expected));
    }

    @Test
    void multiplicationTableThree() {
        int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        int[][] actual = Exercise9.multiplicationTable(3);

        assertThat(actual, is(expected));
    }
}
