/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s06;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.Assertions.byLessThan;

import org.junit.jupiter.api.Test;

/**
 * AssertJ assertions
 */
class AssertJTest {
    /**
     * Assert that the actual value is true
     */
    @Test
    void ajTrue() {
        boolean actual = isPositive(42);
        assertThat(actual).isTrue();
    }

    /**
     * Assert that the actual value is true (more verbose)
     */
    @Test
    void ajEqTrue() {
        boolean actual = isPositive(42);
        assertThat(actual).isEqualTo(true);
    }

    /**
     * Assert that the actual reference is null
     */
    @Test
    void ajNull() {
        String actual = nullIfPositive(12);
        assertThat(actual).isNull();
    }

    /**
     * Assert that the actual reference is null (more verbose)
     */
    @Test
    void ajEqNull() {
        String actual = nullIfPositive(42);
        assertThat(actual).isEqualTo(null);
    }

    /**
     * Assert that the actual int value is equal to the expected int value
     */
    @Test
    void ajEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Assert that the actual double value is close to the expected double value
     * with a stated precision.
     * <p>
     * With a lower precision the assertion should fail
     */
    @Test
    void ajDoubleClose() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual).isCloseTo(expected, withPrecision(.000_000_000_000_000_2));
    }

    /**
     * Assert that the actual double value is not close to the expected double value
     * with a stated offset.
     * <p>
     * With a higher offset the assertion should fail
     */
    @Test
    void ajDoubleNotClose() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual).isNotCloseTo(expected, byLessThan(.000_000_000_000_000_1));
    }

    /**
     * Assert that actual starts with prefix
     */
    @Test
    void ajStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual).startsWith(prefix);
    }

    /**
     * Assert that actual does not start with prefix
     */
    @Test
    void ajNotStart() {
        String prefix = "Ton";
        String actual = "Tom Jones";
        assertThat(actual).doesNotStartWith(prefix);
    }

    /**
     * Utility method to experiment on testing. Notice that it is _not_ annotated as
     * Test, so are ignored by JUnit
     * 
     * @param value an integer
     * @return true if the value is greater than zero
     */
    private boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Utility method to experiment on testing. Notice that it is _not_ annotated as
     * Test, so are ignored by JUnit
     * 
     * @param value an integer
     * @return null if the value is greater than zero
     */
    private String nullIfPositive(int value) {
        return value > 0 ? null : "not a null";
    }
}
