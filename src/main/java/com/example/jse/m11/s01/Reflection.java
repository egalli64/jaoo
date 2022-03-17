package com.example.jse.m11.s01;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflection {
    private static void printIntegerPublicMethods() {
        Class<Integer> c = Integer.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void printDefaultArrayListCapacity() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);

        try {
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] data = (Object[]) field.get(al);
            System.out.println("My ArrayList has capacity " + data.length);
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            System.out.println("Couldn't get ArrayList capacity: " + e.getMessage());
        } catch (InaccessibleObjectException ioe) {
            System.out.println("Java 16+ denies access: " + ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        printIntegerPublicMethods();
        printDefaultArrayListCapacity();
    }
}
