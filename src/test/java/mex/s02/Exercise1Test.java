package mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void speedPlain() {
        double actual = Exercise1.speed(100.0, 9.58);
        double expected = 10.438;

        assertThat(actual).isEqualTo(expected, withPrecision(3d));
    }

    @Test
    void speedInfinity() {
        double actual = Exercise1.speed(100.0, 0.0);
        double expected = Double.POSITIVE_INFINITY;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Disabled("enable it for an exception throwing version")
    void speedNegativeTime() {
        try {
            Exercise1.speed(100, -1);
            fail("An ExUncheckedException was expected");
        } catch (Exception eue) {
            String message = eue.getMessage();
            assertThat(message).isEqualTo("No negative values expected");
        }
    }
}
