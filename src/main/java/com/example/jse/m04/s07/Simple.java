/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s07;

import java.util.logging.Logger;

/**
 * A logging example by JUL
 */
public class Simple {
    /** the logger */
    private static final Logger log = Logger.getLogger(Simple.class.getName());

    /**
     * Print to system out (for the user), then log a few message with different
     * severity (for developers)
     */
    public void f() {
        System.out.println("simple");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }
}
