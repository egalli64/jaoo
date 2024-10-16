/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy (abstract?)
 * <P>
 * TODO (1): it should be an abstract class<BR>
 * TODO (2): each vehicle should steer left/right, and brake
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
