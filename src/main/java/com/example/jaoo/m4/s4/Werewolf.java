/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4;

/**
 * A man-wolf. Can't extends more than one class, so extends Man and implements
 * Wolfable
 */
public class Werewolf extends Man implements Wolfable {
    // !!! BAD idea, see Man.name !!! TODO: fix the mistake
    private String name;

    /**
     * Canonical constructor
     * 
     * @param name the werewolf name
     */
    public Werewolf(String name) {
        // more info on super soon
        // super(name);
        this.name = name;
    }

    /**
     * Specific werewolf method, something in between howl() and Man::sayHello()
     */
    public void sayHowllo() {
        System.out.println("Howllo, I'm " + name);
    }

    @Override
    public void howl() {
        System.out.println("Howhowl, I'm " + name);
    }

    @Override
    public void attack(Man man) {
        System.out.printf("%s is attacking %s%n", name, man);
    }

    @Override
    public String toString() {
        return "A Werewolf named " + name;
    }
}
