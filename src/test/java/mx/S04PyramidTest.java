package mx;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S04PyramidTest {

    @Test
    void pyramidPlain() {
        int input = 3;
        String[] actual = S04.pyramid(input);

        assertThat(actual.length, is(input));
        for (int i = 0; i < input; i++) {
            assertThat(actual[i].length(), is(i + 1));

            // TODO: only 'X' are expected in each string
        }
    }

}
