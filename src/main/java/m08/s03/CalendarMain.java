package m08.s03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {
    public static void main(String[] args) {
        System.out.println("A date in September from calendar (all time info): " +
                new GregorianCalendar(2021, Calendar.SEPTEMBER, 30, 12, 59, 30).getTime());
        System.out.println("A date in September from calendar (no time -> midnight): " +
                new GregorianCalendar(2021, Calendar.SEPTEMBER, 30).getTime());

        Calendar now = new GregorianCalendar();
        System.out.println("Date from calendar (default = now): " + now.getTime());

        System.out.printf("Today: %d-%d-%d %n",
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.MONTH) + 1, now.get(Calendar.YEAR));
    }
}
