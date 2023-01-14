/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m04.s08;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.example.jse.m04.s07.Simple;

/**
 * Logging with JUL, a deeper example
 */
public class Main {
    /** The JUL logger, see static initializer for its setup */
    private static final Logger log;

    static {
        var stream = Main.class.getClassLoader().getResourceAsStream("m04/s08/logging.properties");
        if (stream == null) {
            throw new IllegalStateException("Can't get logging properties");
        }

        try {
            // ensure used language is _not_ chosen by the OS
            Locale.setDefault(Locale.ENGLISH);
            LogManager.getLogManager().readConfiguration(stream);
            log = Logger.getLogger(Main.class.getName());
        } catch (SecurityException | IOException e) {
            throw new IllegalStateException("Can't configure logger", e);
        }
    }

    /**
     * See some log in action
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("main");
        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");

        Other other = new Other();
        other.f();

        Simple simple = new Simple();
        simple.f();

        System.out.println("Some risky code");
        try {
            int x = 7 / 0;
            System.out.println("x = " + x);
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Cannot divide an integer by zero", ex);
            System.out.println("Sorry, something went wrong ...");
        }
    }
}
