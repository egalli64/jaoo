/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * TODO: MotorBike is-a Vehicle
 */
public class MotorBike {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public MotorBike() {
        log.info("MotorBike created");
    }
}
