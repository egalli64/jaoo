/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaoo.m5.s3;

public class MainWeekDay {
    public static void main(String[] args) {
        System.out.println("The available weekdays:");
        for (WeekDay cur : WeekDay.values()) {
            System.out.println(cur);
        }
    }
}
