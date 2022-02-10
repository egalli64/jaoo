package com.example.jse.m14.s02.ioc;

public class Main {
    public static void main(String[] args) {
        Client tom = new ChatClient("Tom");
        Client bob = new ChatClient("Bob");

        tom.send("Bob", "Hello");
        timeWaster(1);
        bob.send("Tom", "Hi");

        timeWaster(4);
        System.out.println("Main is done");
    }

    private static void timeWaster(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Wasting time in main ...");
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}
