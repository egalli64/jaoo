/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s08;

import com.example.jse.m02.s07.IfDay;
import com.example.jse.m02.s07.WeekDay;

/**
 * Control flow - Decision: switch and enumerator
 */
public class SwitchDay {
    /**
     * Pick a week day randomly, then print the associated food of the day
     * 
     * @param args not used
     * @see WeekDay enumerator for the week days
     * @see IfDay same result, but using if-else instead
     */
    public static void main(String[] args) {
        WeekDay today = SwitchDay.aDay();
        System.out.println("Today is " + today);

        switch (today) {
        case MONDAY:
            System.out.println("Chinese");
            break;
        case TUESDAY:
            System.out.println("Hamburger");
            break;
        case WEDNESDAY:
            System.out.println("Pasta");
            break;
        case THURSDAY:
            System.out.println("Fish and Chips");
            break;
        case FRIDAY:
            System.out.println("Pizza");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Something else");
            break;
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
