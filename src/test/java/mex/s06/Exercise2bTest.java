package mex.s06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise2bTest {
    @Test
    void averagePlain() {
        double actual = Exercise2b.median(new int[] { 1, 2, 3 });
        double expected = 2.0;

        assertThat(actual).isEqualTo(expected);
    }
}
