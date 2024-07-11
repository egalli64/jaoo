/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s3;

/**
 * An abstract class with final methods
 */
public abstract class BaseClass {
    /**
     * A method that can't be overridden
     */
    public final void f() {
    }

    /**
     * A method that can't be hidden
     */
    public static final void g() {
    }
}
