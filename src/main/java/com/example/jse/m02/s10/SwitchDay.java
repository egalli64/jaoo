package com.example.jse.m02.s10;

public class SwitchDay {
    public static void main(String[] args) {
        WeekDay today = WeekDay.values()[(int) (Math.random() * 7)];
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
}
