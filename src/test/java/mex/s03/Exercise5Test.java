package mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void voteLowA() {
        char actual = Exercise5.vote(90.01);
        char expected = 'A';

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void voteTopB() {
        char actual = Exercise5.vote(90);
        char expected = 'B';

        assertThat(actual).isEqualTo(expected);
    }
}
