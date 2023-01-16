/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11;

/**
 * Fox is a Barking
 */
public class Fox implements Barking {
    @Override
    public String bark() {
        return "Yap";
    }

    @Override
    public String toString() {
        return "Fox";
    }
}