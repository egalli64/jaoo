/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11;

/**
 * WaggingBarking is a Barking
 * <p>
 * The wagging barking classes should implement this interface
 */
interface WaggingBarking extends Barking {
    int DEFAULT_WAG_COUNT = 3;

    /**
     * Specific for wagging-barking objects
     * 
     * @return how the current object wags
     */
    String wag();
}