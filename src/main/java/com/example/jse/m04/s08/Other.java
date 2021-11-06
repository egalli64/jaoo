package com.example.jse.m04.s08;

import java.util.logging.Logger;

public class Other {
    private static final Logger log = Logger.getLogger(Other.class.getName());

    public void f() {
        System.out.println("other");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }
}
