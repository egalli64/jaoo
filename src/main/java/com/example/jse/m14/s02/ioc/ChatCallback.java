package com.example.jse.m14.s02.ioc;

@FunctionalInterface
public interface ChatCallback {
    void callback(String sender, String message);
}
