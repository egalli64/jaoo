package com.example.jse.m11.s11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFuture2T {
    public static void main(String[] args) {
        Future<String> greeter = futureGreet(args.length > 0 ? args[0] : "Hello!");

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

    private static Future<String> futureGreet(String message) {
        System.out.println("Create and start the completable future task");
        CompletableFuture<String> future = new CompletableFuture<>();
        new Thread(() -> {
            try {
                Thread.sleep(1_000);
                future.complete(message);
            } catch (InterruptedException e) {
                future.complete("Interrupted task");
            }
        }).start();

        return future;
    }
}
