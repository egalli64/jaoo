/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s2;

import java.util.Date;
import java.util.Objects;

/**
 * Make dates defensive copies to overcome its mutability
 * <p>
 * When possible, DO NOT USE java.util.Date - see java.time package
 */
public class User {
    private final Date start;
    private final int id;

    /**
     * Defensive copy of the passed start date
     * 
     * @param start user start date
     * @param id    user id
     * @throws NullPointerException if start is null
     */
    public User(Date start, int id) {
        Objects.requireNonNull(start, "start");

        this.start = new Date(start.getTime());
        this.id = id;
    }

    /**
     * Defensive copy of internal details
     * 
     * @return a copy of the internal date
     */
    public Date getStart() {
        return new Date(start.getTime());
    }

    /**
     * This is fine, a primitive is returned by copy
     * 
     * @return the used id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User [start=" + start + ", id=" + id + "]";
    }

    /**
     * Smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            new User(null, 0);
        } catch (NullPointerException npe) {
            System.out.println("Null date not allowed, " + npe);
        }

        Date startDate = new Date();
        User bu = new User(startDate, 42);
        System.out.println("Original user info: " + bu);

        startDate.setTime(startDate.getTime() - 10_000_000_000L);
        System.out.println("Safe user info /1: " + bu);

        Date attack = bu.getStart();
        attack.setTime(0L);
        System.out.println("Safe user info /2: " + bu);
    }
}
