/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m09.s10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A dog serializer / deserializer
 */
public class Main {
    private static final String DOG_FILENAME = "dump.dog";

    /**
     * Smoke test for serialization
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        dogSerializer();

        SerialDog dog = dogDeserializer();
        dog.bark();
    }

    /**
     * Deserializer for dog
     * 
     * @return a serial dog
     */
    private static SerialDog dogDeserializer() {
        System.out.println("Deserializing dog");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DOG_FILENAME))) {
            return (SerialDog) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalStateException("Can't deserialize", e);
        }
    }

    private static void dogSerializer() {
        SerialDog dog = new SerialDog("Tom", 42);
        dog.bark();
        System.out.println("Serializing dog");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DOG_FILENAME))) {
            oos.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
