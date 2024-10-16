/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s2;

/**
 * The barking classes should implement this interface
 */
public interface Barking {
    /** bark sound level, when not specified otherwise */
    public final static int DEFAULT_SOUND_LEVEL = 42;

    /** every barking class should state how its objects bark */
    public void bark();
}
