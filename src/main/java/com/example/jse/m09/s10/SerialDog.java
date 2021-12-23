package com.example.jse.m09.s10;

import java.io.Serial;
import java.io.Serializable;

public class SerialDog implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private final String name;
    private int barkCount;
    private transient int happinessLevel;

    public SerialDog(String name, int happinessLevel) {
        this.name = name;
        this.barkCount = 0;
        this.happinessLevel = happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public void bark() {
        barkCount += 1;
        System.out.printf("%s barks! (%d - %d)%n", name, happinessLevel, barkCount);
    }
}
