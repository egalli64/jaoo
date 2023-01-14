/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s08;

import java.util.logging.Logger;

/**
 * Another class to see JUL at work
 */
public class Other {
    /** Notice that JUL asks the name of the logger */
    private static final Logger log = Logger.getLogger(Other.class.getName());

    /**
     * Print to system out (for the user), then log a few message with different
     * severity (for developers)
     */
    public void f() {
        System.out.println("other");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }
}
