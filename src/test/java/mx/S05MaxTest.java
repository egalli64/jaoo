package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05MaxTest {
    @Test
    void maxPlain() {
        int actual = S05.max(new int[] { 2, 3, 1 });

        assertThat(actual, is(3));
    }
}
