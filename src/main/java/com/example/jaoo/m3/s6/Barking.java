/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s6;

/**
 * The barking classes should implement this interface
 */
interface Barking {
    /** bark sound level, when not specified otherwise */
    int DEFAULT_SOUND_LEVEL = 42;

    /** every barking class should state how its objects bark */
    void bark();
}
