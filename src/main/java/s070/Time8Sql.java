package s070;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time8Sql {
    public static void main(String[] args) {
        Date date = Date.valueOf(LocalDate.now());
        System.out.println("Sql Date" + date);
        System.out.println("Converted to LocalDate: " + date.toLocalDate());
        
        Time time = Time.valueOf(LocalTime.now());
        System.out.println("Sql Time" + time);
        System.out.println("Converted to LocalTime: " + time.toLocalTime());
        
        Timestamp ts = Timestamp.valueOf(LocalDateTime.now());
        System.out.println("Sql Timestamp: " + ts);
        System.out.println("Converted to LocalDateTime: " + ts.toLocalDateTime());
        System.out.println("Converted to Instant: " + ts.toInstant());
    }
}
