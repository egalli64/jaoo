/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

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