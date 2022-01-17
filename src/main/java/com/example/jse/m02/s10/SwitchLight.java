package com.example.jse.m02.s10;

public class SwitchLight {
    public static void main(String[] args) {
        TrafficLight light = Math.random() > 2.0 / 3 ? TrafficLight.GREEN
                : Math.random() > .5 ? TrafficLight.YELLOW : TrafficLight.RED;

        System.out.println("Traffic light is " + light);

        switch (light) {
        case GREEN -> System.out.println("You can go");
        case YELLOW -> {
            System.out.print("Stop, if you can. ");
            System.out.println("Go fast, if you can't stop");
        }
        case RED -> System.out.println("Stop!");
        }
    }
}