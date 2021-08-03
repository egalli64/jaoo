package mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void isAnagramPlain() {
        boolean actual = Exercise5.isAnagram("thing", "night");
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }
}
