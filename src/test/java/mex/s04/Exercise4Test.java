package mex.s04;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void sqrt2() {
        double actual = Exercise4.sqrt(2);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, withPrecision(9d));

    }

    @Test
    void sqrtEpsilon() {
        double epsilon = 0.001;
        double actual = Exercise4.sqrt(2, epsilon);
        double expected = Math.sqrt(2);

        assertThat(actual).isEqualTo(expected, byLessThan(epsilon * epsilon));
    }
}
