package com.example.jse.m06.s11;

interface WaggingBarker extends Barker {
    int DEFAULT_WAG_COUNT = 3;

    String wag();
}