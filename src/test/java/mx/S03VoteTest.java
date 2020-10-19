package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03VoteTest {
    @Test
    void voteLowA() {
        char actual = S03.vote(90.01);

        assertThat(actual, is('A'));
    }

    @Test
    void voteTopB() {
        char actual = S03.vote(90);

        assertThat(actual, is('B'));
    }
}
