package com.example.jse.m13.s13;

public class Dog {
    private String name;
    private String owner;
    private int age;
    private double weight;

    public Dog(String name, String owner, int age, double weight) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
