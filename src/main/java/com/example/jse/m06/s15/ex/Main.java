package com.example.jse.m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = { /* ... */ };

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println("Let's fight ...");
        for (Actor actor : actors) {
            System.out.println("Actor: " + actor);
            // ...
        }
    }
}
