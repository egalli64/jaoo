package mex.s05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void removeCharPlain() {
        String actual = Exercise4.removeChar("example", 5);
        String expected = "exampe";

        assertThat(actual).isEqualTo(expected);
    }
}
