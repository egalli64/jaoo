package com.example.jse.m06.s15;

public abstract class Pet implements Brushable {
    private String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void brush() {
        System.out.println("Brushing " + name);
    }

    public abstract void saySomething();
}