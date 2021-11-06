package com.example.jse.m06.s11;

public class Robot extends Toy implements Barker, Jumper {
    public Robot() {
        super(10);
    }

    @Override
    public String bark() {
        return "B-A-R-K";
    }

    @Override
    public String toString() {
        return "Hello " + super.toString();
    }

    @Override
    public void jump() {
        System.out.println("Jump!");
    }

    // overload
    public void jump(int times) {
        for (int i = 0; i < times; i++) {
            jump();
        }
    }
}
