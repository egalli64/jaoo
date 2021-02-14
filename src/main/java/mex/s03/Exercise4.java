package mex.s03;

public class Exercise4 {
    /**
     * Check if the passed day requires an early wake up
     * 
     * @param day
     * @param vacation false when in a working period
     * @return false during weekend or holiday
     */
    public static boolean isAlarmSet(WeekDay day, boolean vacation) {
        if (vacation) {
            return false;
        }

        switch (day) {
        case SATURDAY:
        case SUNDAY:
            return false;
        default:
            return true;
        }
    }
}
