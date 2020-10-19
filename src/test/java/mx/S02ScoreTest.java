package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S02ScoreTest {
    @Test
    void scoreTen() {
        int actual = S02.score(0.1, -0.1);

        assertThat(actual, is(10));
    }

    @Test
    void scoreOne() {
        int actual = S02.score(3.55, 3.55);

        assertThat(actual, is(1));
    }
}
