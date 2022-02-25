package com.example.jse.m11.s14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ASimpleFutureTask {
    public static void main(String[] args) {
        FutureTask<String> greeter = new FutureTask<>(() -> {
            System.out.println("Simulating a long task in greeter");
            Thread.sleep(1_000);
            return "Hello from greeter!";
        });

        System.out.println("When ready, start the future task");
        new Thread(greeter).start();

        if (greeter.isDone()) {
            System.out.println("Unexpected, the greeter should take some time to complete!");
        } else {
            System.out.println("While the greeter works, do something else in the main thread");
        }

        while (!greeter.isDone()) {
            try {
                System.out.println("Simulating some work in the main thread");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }

        }

        try {
            System.out.println("We get here when greeter is done");
            System.out.println(greeter.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
