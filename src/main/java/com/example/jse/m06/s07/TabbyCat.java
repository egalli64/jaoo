package com.example.jse.m06.s07;

public class TabbyCat extends CovariantCat {
    @Override
    public TabbyCat createSon() {
        return new TabbyCat();
    }
}
