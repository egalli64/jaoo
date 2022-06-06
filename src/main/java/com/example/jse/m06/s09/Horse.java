package com.example.jse.m06.s09;

public class Horse extends Mammal implements Neighing {
    public Horse(int gestation) {
        super(gestation);
    }

    @Override
    public String toString() {
        return "Horse [gestation=" + gestation + "]";
    }

    @Override
    public void neigh() {
        System.out.println("MHMDHD");
    }
}
