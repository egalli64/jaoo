/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.mex.s02;

import java.util.logging.Logger;

/**
 * Operators - Exercise 5
 * 
 * Comparison between distances (calculated by Pythagorean theorem)
 */
public class Exercise5 {
    private static final Logger log = Logger.getGlobal();

    /**
     * Score based on distance from (0, 0)
     * <li>less than 1: 10
     * <li>in [1, 5): 5
     * <li>in [5, 10): 1
     * <li>equal to or more than 10: 0
     *
     * @param x
     * @param y
     *
     * @return resulting points: 0, 1, 5, or 10
     */
    public static int score(double x, double y) {
        log.info(String.format("(%.5f, %.5f)", x, y));

        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
