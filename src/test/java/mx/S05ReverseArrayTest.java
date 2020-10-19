package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05ReverseArrayTest {
    @Test
    void reverseIntArrayPlain() {
        int[] original = new int[] { 1, 2, 3 };
        int[] actual = S05.reverse(original);

        assertThat(actual.length, is(original.length));
        for (int i = 0; i < original.length; i++) {
            assertThat(actual[i], is(original[original.length - i - 1]));
        }
    }
}
