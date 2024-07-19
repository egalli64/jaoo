/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4;

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
