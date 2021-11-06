package com.example.jse.m06.s09;

import java.util.logging.Logger;

public class Tail {
    private static final Logger log = Logger.getGlobal();
    private int size;

    public Tail(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void wag() {
        log.info(toString());
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
