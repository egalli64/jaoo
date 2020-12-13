package m08.s03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDate.of(2021, Month.JANUARY, 2));
        System.out.println(LocalDate.of(2021, 1, 2));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
    }
}
