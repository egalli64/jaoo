package com.example.jse.m11.s11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture1T {
    public static void main(String[] args) {
        CompletableFuture<String> cf = new CompletableFuture<>();

        if(!cf.isDone()) {
            System.out.println("cf has to be completed");
        }

        cf.complete("Completed in the main thread");

        if(cf.isDone()) {
            System.out.println("Now cf has been completed");
        }

        try {
            System.out.println("cf value is: " + cf.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}
