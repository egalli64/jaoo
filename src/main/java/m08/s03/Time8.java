package m08.s03;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class Time8 {
    public static void main(String[] args) {
        System.out.println("A date (of /1): " +
                LocalDate.of(2021, Month.SEPTEMBER, 30));
        System.out.println("A date (of /2): " +
                LocalDate.of(2021, 9, 30));
        System.out.println("A date (parse): " +
                LocalDate.parse("2021-09-30"));
        LocalDate date = LocalDate.now();
        System.out.println("Current date (now): " + date);
        System.out.printf("Current date (getter /1): %d %d %d%n",
                date.getDayOfMonth(), date.getMonthValue(), date.getYear());
        System.out.printf("Current date (getter /2): %d %d %d%n",
                date.get(ChronoField.DAY_OF_MONTH), date.get(ChronoField.MONTH_OF_YEAR), date.get(ChronoField.YEAR));

        System.out.println("Current date (formatter): " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("A time (of): " +
                LocalTime.of(11, 15, 24));
        System.out.println("A time (parse): " +
                LocalTime.parse("11:15:24"));
        LocalTime time = LocalTime.now();
        System.out.println("Current time (now): " + time.toString());
        System.out.printf("Current time (getter /1): %d %d %d%n",
                time.getHour(), time.getMinute(), time.getSecond());
        System.out.printf("Current time (getter /2): %d %d %d%n",
                time.get(ChronoField.HOUR_OF_DAY), time.get(ChronoField.MINUTE_OF_HOUR), time.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("Current time (formatter): " +
                time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        System.out.println("Date time (now): " + LocalDateTime.now());
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Date time (by aggregation): " + dateTime);
        System.out.printf("Current date time (getter): %d %d %d - %d %d %d%n",
                date.getDayOfMonth(), date.getMonthValue(), date.getYear(),
                dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());

        System.out.println("Current date time (formatter): " +
                dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        System.out.println("Current date time (formatter): " +
                dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.systemDefault())));

        System.out.println("Date extracted from date-time: " +
                dateTime.toLocalDate());

        System.out.println("Time extracted from date-time: " +
                dateTime.toLocalTime());
    }
}
