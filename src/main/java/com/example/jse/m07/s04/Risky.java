/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s04;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.jse.m07.s03.Exceptional;

/**
 * Try-catching exceptions
 */
public class Risky {
    private static final Logger log = Logger.getGlobal();

    public void aCatcher() {
        Exceptional exceptional = new Exceptional();

        // ...
        try {
            exceptional.aCheckedThrower();

            // called only if no exception before
            // exceptional.close();
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Exception caught in f()", ex);

            // called only when an exception occurs
            // exceptional.close();
        } finally {
            // always called
            exceptional.close();
        }
    }

    public void notACatcher() throws Exception {
        Exceptional exceptional = new Exceptional();

        // ...
        exceptional.aCheckedThrower();
        log.info("This statement won't be reached");
        // ERROR! resource leak!
        exceptional.close();
    }

    public static void main(String[] args) throws Exception {
        Risky risky = new Risky();
        Exceptional exceptional = new Exceptional();

        log.info("I'm about to call aCatcher(), it won't throw exceptions");
        risky.aCatcher();

        log.info("Calling Exceptional.aCheckedThrower() could be dangerous");
        try {
            exceptional.aCheckedThrower();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Something went wrong", e);
        }

        log.info("Final call to Exceptional.aCheckedThrower(), exception passed on to JVM");
        try {
            exceptional.aCheckedThrower();
        } finally {
            System.out.println("done call to Exceptional.aCheckedThrower()");
            exceptional.close();
        }

        log.info("This statement won't be reached");
    }
}
