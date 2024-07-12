/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s7;

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
