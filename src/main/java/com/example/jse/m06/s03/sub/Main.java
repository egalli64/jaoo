package com.example.jse.m06.s03.sub;

import com.example.jse.m06.s03.BasicClass;

/**
 * Each package is different - hierarchy does not matter
 * <p>
 * BasicClass is not in this package, has to be imported to be used here
 * <p>
 * Being in the "super" package is not enough
 */
public class Main {
    public static void main(String[] args) {
        BasicClass bc = new BasicClass();
        System.out.println(bc);

        Extended poodle = new Extended();
        System.out.println(poodle);
    }
}
