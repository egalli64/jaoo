package com.example.jse.m14.s15;

public interface Publisher {
    void register(Subscriber observer);

    void remove(Subscriber observer);
}