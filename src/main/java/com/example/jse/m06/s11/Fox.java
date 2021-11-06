package com.example.jse.m06.s11;

public class Fox implements Barker {
    @Override
    public String bark() {
        return "Yap";
    }

    @Override
    public String toString() {
        return "Fox";
    }
}