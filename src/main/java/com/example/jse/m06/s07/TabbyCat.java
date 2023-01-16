/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07;

/**
 * A sample class with a covariant override
 */
public class TabbyCat extends CovariantCat {
    /**
     * Notice that the return type is different from the super method. The son of a
     * tabby cat is another tabby cat, not a generic covariant cat.
     */
    @Override
    public TabbyCat createSon() {
        return new TabbyCat();
    }

    @Override
    public String toString() {
        return "A tabby cat";
    }
}
