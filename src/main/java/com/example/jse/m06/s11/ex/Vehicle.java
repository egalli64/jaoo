/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Vehicle() {
        log.info("Vehicle created");
    }
}
