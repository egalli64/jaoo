package mex.s02;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mex.ExerciseUncheckedException;

class Exercise1Test {
    @Test
    void speedPlain() {
        double actual = Exercise1.speed(100.0, 9.58);
        double expected = 10.438;

        assertThat(actual, closeTo(expected, 0.001));
    }

    @Test
    void speedInfinity() {
        double actual = Exercise1.speed(100.0, 0.0);
        double expected = Double.POSITIVE_INFINITY;

        assertThat(actual, is(expected));
    }

    @Test
    @Disabled("enable it for an exception throwing version")
    void speedNegativeTime() {
        try {
            Exercise1.speed(100, -1);
            fail("An ExUncheckedException was expected");
        } catch (ExerciseUncheckedException eue) {
            String message = eue.getMessage();
            assertThat(message, is("No negative values expected"));
        }
    }
}
