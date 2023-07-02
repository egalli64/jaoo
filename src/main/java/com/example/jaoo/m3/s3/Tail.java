/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s3;

import java.util.logging.Logger;

/**
 * Sample class, used in composition
 */
public class Tail {
    private static final Logger log = Logger.getGlobal();
    private int size;

    /**
     * Canonical constructor
     * 
     * @param size the size of this tail
     */
    public Tail(int size) {
        this.size = size;
    }

    /**
     * Getter
     * 
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * A tail could wag
     */
    public void wag() {
        log.info(toString());
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
