package com.example.jse.m09.s10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        dogSerializer();

        SerialDog dog = dogDeserializer();
        dog.bark();
    }

    private static SerialDog dogDeserializer() {
        System.out.println("Deserializing dog");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dump.dog"))) {
            return (SerialDog) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalStateException("Can't deserialize", e);
        }
    }

    private static void dogSerializer() {
        SerialDog dog = new SerialDog("Tom", 42);
        dog.bark();
        System.out.println("Serializing dog");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dump.dog"))) {
            oos.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
