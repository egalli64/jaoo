/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

/**
 * Inheritance
 */
public class Main {
    /**
     * A few interconnected objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Object[] objects = { new Man("Tom"), new Werewolf("Wally"), new Wolf() };

        for (Object object : objects) {
            System.out.println(object.toString());
        }

        Werewolf ww = new Werewolf("Uli");
        ww.howl();
        ww.sayHello();
        ww.sayHowllo();
    }
}
