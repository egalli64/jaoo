package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void voteLowA() {
        char actual = Exercise5.vote(90.01);
        char expected = 'A';

        assertThat(actual, is(expected));
    }

    @Test
    void voteTopB() {
        char actual = Exercise5.vote(90);
        char expected = 'B';

        assertThat(actual, is(expected));
    }
}
