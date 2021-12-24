package com.example.jse.m11.s07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ASimpleFutureTask {
    public static void main(String[] args) {
        FutureTask<String> greeter = new FutureTask<>(() -> {
            Thread.sleep(1_000); // emulation of a long task
            return "Hello!";
        });

        System.out.println("When ready, start the future task");
        new Thread(greeter).start();

        if(greeter.isDone()) {
            System.out.println("Unexpected, the greeter should take some time to complete!");
        } else {
            System.out.println("While the greeter works, do something else in the main thread");
        }

        System.out.println("When there is nothing more to do, wait the greeter to complete");
        try {
            System.out.println(greeter.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }

    }
}
