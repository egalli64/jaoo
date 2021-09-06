package m08.s06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterMain {
    public static void main(String[] args) {
        // date formatter
        LocalDate today = LocalDate.now();
        System.out.println("Full current date: " +
                today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // time formatter
        LocalTime now = LocalTime.now();
        System.out.println("Medium current time: " +
                now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        LocalDateTime current = LocalDateTime.of(today, now);

        // date-time formatters
        var medium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Medium current date time: " + current.format(medium));

        var full = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .withZone(ZoneId.systemDefault());
        System.out.println("Full current date time: " + current.format(full));
    }
}
