/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s6;

/**
 * A sealed interface
 */
public sealed interface Brushable permits Dog, TeddyBear {
    void brush();
}
