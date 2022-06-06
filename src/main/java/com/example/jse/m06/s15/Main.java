package com.example.jse.m06.s15;

public class Main {
    public static void main(String[] args) {
        Brushable kim = new Cat("Kim");
        kim.brush();

        if (kim instanceof Dog) {
            Dog dog = (Dog) kim;
            dog.bark();
        }

//		Cat cat = (Cat) new Dog();

        Pet pet = new Dog("Bob");

        // risky
        Dog dog = (Dog) pet;
        dog.bark();

        // next line leads to a ClassCastException
//        Cat cat = (Cat) pet;
        // next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {
            Cat tom = (Cat) pet;
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }

        Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

        for (int i = 0; i < pets.length; i++) {
            pets[i].brush();
        }

        f(pets);
        g(pets);
    }

    static void f(Pet[] pets) {
        System.out.println("Let the pets bark and meow ...");
        if (pets == null) {
            return;
        }

        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                dog.bark();
            } else if (pet instanceof Cat) {
                ((Cat) pet).meow();
            }
        }
    }

    static void g(Pet[] pets) {
        System.out.println("Let the pets say something ...");
        if (pets == null) {
            return;
        }

        for (Pet pet : pets) {
            pet.saySomething();
        }
    }
}
