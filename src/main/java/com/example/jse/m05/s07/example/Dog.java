package com.example.jse.m05.s07.example;

public class Dog {
    private static int count = 0;
    private static int barkCount = 0;
    private int barkCountCurrent;
    private String name;

    public Dog(String name) {
        this.name = name;
        this.barkCountCurrent = 0;
        Dog.count += 1;
    }

    public Dog(String name, int barkCountCurrent) {
        this.name = name;
        this.barkCountCurrent = barkCountCurrent;
        Dog.count += 1;
    }

    void bark() {
        Dog.barkCount += 1;
        barkCountCurrent += 1;
        System.out.println(this.name + " bark! (" + Dog.barkCount + ")");
        if (barkCountCurrent > 1) {
            double rate = (double) barkCountCurrent / Dog.barkCount;
            System.out.println("Bark rate: " + rate);
        }
    }

    public static int getCount() {
        return Dog.count;
    }

    public static int getBarkCount() {
        return Dog.barkCount;
    }

    public int getBarkCountCurrent() {
        return barkCountCurrent;
    }

    @Override
    public String toString() {
        return "Dog [barkCountCurrent=" + barkCountCurrent + ", name=" + name + "]";
    }
}
