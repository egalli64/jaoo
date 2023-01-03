/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.example.jse.mex.ExerciseUncheckedException;

/**
 * Operators - Exercise 1
 * 
 * Dividing floating point values
 */
class Exercise1Test {
    /**
     * 100 meters in 9.58 seconds means an _average_ speed of 10.4384... m/s
     * <p>
     * 100m World Record set by Usain Bolt (2009)
     */
    @Test
    void speedPlainJupiterOnly() {
        double actual = Exercise1.speed(100.0, 9.58);
        double expected = 10.438;

        Assertions.assertEquals(expected, actual, .001);
    }

    /**
     * Duplicated test to show the AssertJ approach
     */
    @Test
    void speedPlainWithAssertJ() {
        double actual = Exercise1.speed(100.0, 9.58);
        double expected = 10.438;

        assertThat(actual).isEqualTo(expected, withPrecision(.001));
    }

    /**
     * 100 meters in 0.0 seconds means positive infinity velocity
     */
    @Test
    void speedPositiveInfinity() {
        double actual = Exercise1.speed(100.0, 0.0);
        double expected = Double.POSITIVE_INFINITY;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * -100 meters in 0.0 seconds means negative infinity velocity
     */
    @Test
    void speedNegativeInfinity() {
        double actual = Exercise1.speed(-100.0, 0.0);
        double expected = Double.NEGATIVE_INFINITY;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Negative time should lead to an ExerciseUncheckedException with message "Time
     * should be non-negative"
     * <p>
     * Enable it when you know about exceptions
     */
    @Test
    @Disabled("enable it for testing exceptional cases")
    void speedNegativeTimeJupiterOnly() {
        ExerciseUncheckedException ex = Assertions.assertThrows( //
                ExerciseUncheckedException.class, () -> Exercise1.speed(100, -1));
        Assertions.assertEquals("Time should be non-negative", ex.getMessage());
    }

    /**
     * Duplicated test to show the AssertJ approach
     * <p>
     * Enable it when you know about exceptions
     */
    @Test
    @Disabled("enable it for testing exceptional cases")
    void speedNegativeTimeWithAssertJ() {
        assertThatThrownBy(() -> Exercise1.speed(100, -1)) //
                .isInstanceOf(ExerciseUncheckedException.class) //
                .hasMessage("Time should be non-negative");
    }
}
