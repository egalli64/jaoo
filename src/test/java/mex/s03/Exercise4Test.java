package mex.s03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise4Test {
    @Test
    void isAlarmSetWorkingDay() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.TUESDAY, false);
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isAlarmSetWeekend() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.SUNDAY, false);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isAlarmSetVacation() {
        boolean actual = Exercise4.isAlarmSet(WeekDay.FRIDAY, true);
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }
}
