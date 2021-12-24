package com.example.jse.m11.s08;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFuture2TSupply {
    public static void main(String[] args) {
        System.out.println("Create and start the completable future task");
        Future<String> greeter = CompletableFuture.supplyAsync( () -> {
            try {
                Thread.sleep(1_000);
                return args.length > 0 ? args[0] : "Hello!";
            } catch (InterruptedException e) {
                return "Interrupted task";
            }
        });

        if (greeter.isDone()) {
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
