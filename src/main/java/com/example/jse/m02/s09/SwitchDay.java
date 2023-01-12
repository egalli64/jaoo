/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s09;

import com.example.jse.m02.s07.WeekDay;

/**
 * Control flow - Decision: switch (modern) and enumerator
 */
public class SwitchDay {
    /**
     * Pick a week day randomly, then print the associated food of the day
     * 
     * @param args not used
     * @see WeekDay enumerator for the week days
     * @see com.example.jse.m02.s08.SwitchDay same result using classic switch
     */
    public static void main(String[] args) {
        WeekDay today = SwitchDay.aDay();
        System.out.println("Today is " + today);

        switch (today) {
        case MONDAY -> System.out.println("Chinese");
        case TUESDAY -> System.out.println("Hamburger");
        case WEDNESDAY -> System.out.println("Pasta");
        case THURSDAY -> System.out.println("Fish and Chips");
        case FRIDAY -> System.out.println("Pizza");
        case SATURDAY, SUNDAY -> System.out.println("Something else");
        }
    }

    /**
     * A randomly chosen week day
     * 
     * @return a WeekDay
     * @see WeekDay enumerator for week days
     */
    private static WeekDay aDay() {
        WeekDay[] days = WeekDay.values();
        return days[(int) (Math.random() * days.length)];
    }
}
