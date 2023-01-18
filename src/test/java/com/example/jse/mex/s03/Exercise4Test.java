/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Decisions - Exercise 4
 * <p>
 * Common status of two variables
 */
class Exercise4Test {
    /**
     * TUE, not holiday -> wake up!
     */
    @Test
    void isAlarmSetWorkingDay() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.TUESDAY, false);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * SUN, not holiday -> sleep
     */
    @Test
    void isAlarmSetWeekend() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.SUNDAY, false);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    /**
     * FRI, holiday -> sleep
     */
    @Test
    void isAlarmSetVacation() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.FRIDAY, true);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }
}
