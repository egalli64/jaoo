/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * java time format DateTimeFormatter
 */
public class DateTimeFormatterMain {
    /**
     * Basic DateTimeFormatter functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // DateTimeFormatter on LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("DateTimeFormatter on LocalDate");
        for (var style : FormatStyle.values()) {
            System.out.println(style + ": " + today.format(DateTimeFormatter.ofLocalizedDate(style)));
        }
        System.out.println();

        // DateTimeFormatter on LocalTime - only MEDIUM and SHORT formats are supported
        LocalTime now = LocalTime.now();

        System.out.println("DateTimeFormatter on LocalTime");
        for (var style : FormatStyle.values()) {
            try {
                System.out.println(style + ": " + now.format(DateTimeFormatter.ofLocalizedTime(style)));
            } catch (DateTimeException ex) {
                System.err.printf("The style %s is not supported on LocalTime\n", style);
            }
        }
        System.out.println();

        // date-time formatters - for FULL and LONG format is required the time zone
        LocalDateTime current = LocalDateTime.of(today, now);

        System.out.println("DateTimeFormatter on LocalDateTime");
        for (var style : FormatStyle.values()) {
            System.out.printf("%s: %s\n", style,
                    current.format(DateTimeFormatter.ofLocalizedDateTime(style).withZone(ZoneId.systemDefault())));
        }
        System.out.println();

        // Formatting on LocalDateTime specifying a Locale
        System.out.println("Japan Full: " + //
                current.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL) //
                        .withZone(ZoneId.systemDefault()) //
                        .withLocale(Locale.JAPAN)));
        System.out.println("Spanish Full: " + //
                current.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG) //
                        .withZone(ZoneId.systemDefault()) //
                        .withLocale(new Locale.Builder().setLanguage("es").build())));
    }
}
