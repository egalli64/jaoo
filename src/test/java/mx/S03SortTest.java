package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03SortTest {
    @Test
    void sortPlain() {
        int[] expected = { 1, 2, 3 };
        int[] actual = S03.sort(3, 2, 1);

        assertThat(actual, is(expected));
    }
}
