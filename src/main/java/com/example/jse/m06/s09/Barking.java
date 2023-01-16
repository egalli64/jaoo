/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s09;

/**
 * The barking classes should implement this interface
 */
public interface Barking {
    /** bark sound level, when not specified otherwise */
    int DEFAULT_SOUND_LEVEL = 42;

    /** every barking class should state how its objects bark */
    public void bark();
}
