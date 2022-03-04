package com.example.jse.m02.s08;

public class IfDay {
    public static void main(String[] args) {
        WeekDay today = aDay();
        System.out.println("Today is " + today);

        if (today == WeekDay.MONDAY) {
            System.out.println("Chinese");
        } else if (today == WeekDay.TUESDAY) {
            System.out.println("Hamburger");
        } else if (today == WeekDay.WEDNESDAY) {
            System.out.println("Pasta");
        } else if (today == WeekDay.THURSDAY) {
            System.out.println("Fish and Chips");
        } else if (today == WeekDay.FRIDAY) {
            System.out.println("Pizza");
        } else if (today == WeekDay.SATURDAY || today == WeekDay.SUNDAY) {
            System.out.println("Something else");
        }
    }

    /**
     * @return a randomly chosen WeekDay
     */
    private static WeekDay aDay() {
        WeekDay[] days = WeekDay.values();
        return days[(int) (Math.random() * days.length)];
    }
}
