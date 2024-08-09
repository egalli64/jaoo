/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s2;

import java.util.Date;
import java.util.Objects;

/**
 * Apparently, there is no way of changing the user start date after creation.
 * But this in not true.
 * <p>
 * When possible, DO NOT USE java.util.Date - see java.time package
 */
public class BrokenUser {
    private final Date start;
    private final int id;

    /**
     * DANGER! The passed date is not immutable!
     * 
     * @param start user start date
     * @param id    user id
     * @throws NullPointerException if start is null
     */
    public BrokenUser(Date start, int id) {
        this.start = Objects.requireNonNull(start, "start");
        this.id = id;
    }

    /**
     * DANGER! start date is not immutable!
     * 
     * @return a reference to a mutable internal detail!
     */
    public Date getStart() {
        return start;
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
        return "BrokenUser [start=" + start + ", id=" + id + "]";
    }

    /**
     * Smoke test, it shows the class weakness
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            new BrokenUser(null, 0);
        } catch (NullPointerException npe) {
            System.out.println("Null date not allowed, " + npe);
        }

        Date startDate = new Date();
        BrokenUser bu = new BrokenUser(startDate, 42);
        System.out.println("Original user info: " + bu);

        // the local Date object is referenced also by the BrokenUser! 
        startDate.setTime(startDate.getTime() - 10_000_000_000L);
        System.out.println("Changed user info /1: " + bu);

        // the BrokenUser getter return the mutable reference to its Date!
        Date attack = bu.getStart();
        attack.setTime(0L);
        System.out.println("Changed user info /2: " + bu);
    }
}
