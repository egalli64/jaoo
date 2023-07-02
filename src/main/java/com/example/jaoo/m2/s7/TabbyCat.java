/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7;

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
