/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s16;

// Cannot override the final method from Sample
/**
 * A subclass
 */
public class FinExtended extends Final {

    // Won't compile: Cannot override the final method from Final
//    public final void f() {
//    }

    // Won't compile: Cannot override the final method from Final
    // Actually, the message is not correct, static method can't be overridden
//    public static final void g() {
//    }
}
