/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s08;

import java.util.logging.Logger;

/**
 * Logging example, using global JUL
 */
public class Global {
    /** The global JUL logger is very simple to use */
    private static final Logger log = Logger.getGlobal();

    /**
     * Log a message with info severity
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        log.info("Hello");
    }
}
