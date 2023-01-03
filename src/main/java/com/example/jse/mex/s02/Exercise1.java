/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s02;

import java.util.logging.Logger;

import com.example.jse.mex.ExerciseUncheckedException;

/**
 * Operators - Exercise 1
 * 
 * Dividing floating point values
 */
public class Exercise1 {
    private static final Logger log = Logger.getGlobal();

    /**
     * Calculate the average speed (it is very simple, just a division)
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     * @throws ExerciseUncheckedException (optional) in case of negative time
     */
    public static double speed(double distance, double time) {
        log.info(String.format("distance is %.3f and time is %.2f", distance, time));

        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
