/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * The classes having a wolf behavior should implement this interface
 */
interface Wolfable {
    /**
     * Perform a howl
     */
    public void howl();

    /**
     * Attack a man
     * 
     * @param man an unlucky fellow
     */
    public void attack(Man man);
}
