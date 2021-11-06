package com.example.jse.m06.s04.other;

import com.example.jse.m06.s04.Pet;

public class PetSub extends Pet {
    public void f() {
        // super's protected members are accessible
        weight += 10;
        System.out.println(weight);

        // super's private members are _not_ accessible
//        System.out.println(name);

        // super's package members are _not_ accessible - static or not
//        System.out.println(Pet.count);
    }
}
