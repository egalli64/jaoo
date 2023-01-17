/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m08.s07;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Date in java.sql and java.time
 */
public class TimeSqlMain {
    /**
     * Java SQL integration for date/time
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Date date = Date.valueOf(LocalDate.now());
        System.out.println("SQL Date: " + date);
        System.out.println("Converted to LocalDate: " + date.toLocalDate());

        Time time = Time.valueOf(LocalTime.now());
        System.out.println("SQL Time: " + time);
        System.out.println("Converted to LocalTime: " + time.toLocalTime());

        Timestamp ts = Timestamp.valueOf(LocalDateTime.now());
        System.out.println("SQL Timestamp: " + ts);
        System.out.println("Converted to LocalDateTime: " + ts.toLocalDateTime());
        System.out.println("Converted to Instant: " + ts.toInstant());
    }
}
