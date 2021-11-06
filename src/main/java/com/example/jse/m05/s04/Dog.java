package com.example.jse.m05.s04;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;
    private String breed;

    private Dog(String name, String breed) {
        this.name = name == null ? "No Name" : name;
        this.breed = breed == null ? "Mixed" : breed;
    }

    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ...
         * 
         * 2. goto database for info on dog breed ...
         * 
         * 3. ...
         */

        log.info("Creating a dog with no name");
        return new Dog(null, null);
    }

    public static Dog createWithName(String name) {
        log.info(String.format("Creating a dog with name [%s]", name));
        return new Dog(name, null);
    }

    public static Dog createWithBreedButNoName(String breed) {
        log.info(String.format("Creating a dog with no name and breed [%s]", breed));
        return new Dog(null, breed);
    }

    public void bark() {
        System.out.println(String.format("%s %s: woof", breed, name));
    }
}
