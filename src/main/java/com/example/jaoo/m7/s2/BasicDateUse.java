/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s2;

import java.util.Date;

/**
 * java.util.Date should be used only in legacy code
 */
public class BasicDateUse {
    /**
     * Basics on Date
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        date.setTime(date.getTime() - 1_000_000_000);
        System.out.println("Moving back one billion ms: " + date);

        System.out.println("Nine hundred billion ms in the UNIX epoch: " + new Date(900_000_000_000L));

        Date base = new Date(0L);
        System.out.println("The beginning of UNIX epoch: " + base);
    }
}
