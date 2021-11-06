package com.example.jse.m06.s10;

// can't extends more than one class
public class Werewolf extends Man implements WolfBehavior {
    // !!! BAD idea, see Man.name !!!
    private String name;

    public Werewolf(String name) {
        // more info on super soon
        // super(name);
        this.name = name;
    }

    @Override
    public void howl() {
        System.out.println("Howhowl, I'm " + name);
    }

    @Override
    public String toString() {
        return "A Werewolf named " + name;
    }

    public void sayHowllo() {
        System.out.println("Howllo, I'm " + name);
    }

    @Override
    public String attack(Man man) {
        return "Attacking a man";
    }
}
