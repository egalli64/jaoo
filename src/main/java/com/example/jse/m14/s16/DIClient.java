package com.example.jse.m14.s16;

public class DIClient {
    private DataService ds;

    public DIClient(DataService ds) {
        this.ds = ds;
    }

    public void doSomething() {
        System.out.println(ds.getData());
    }
}
