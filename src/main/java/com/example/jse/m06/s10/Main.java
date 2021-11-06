package com.example.jse.m06.s10;

public class Main {
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
