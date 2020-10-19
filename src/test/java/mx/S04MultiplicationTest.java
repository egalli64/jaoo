package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S04MultiplicationTest {
    @Test
    void multiplicationTableZero() {
        int[][] expected = {};
        int[][] actual = S04.multiplicationTable(0);

        assertThat(actual, is(expected));
    }

    @Test
    void multiplicationTableThree() {
        int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        int[][] actual = S04.multiplicationTable(3);

        assertThat(actual, is(expected));
    }
}
