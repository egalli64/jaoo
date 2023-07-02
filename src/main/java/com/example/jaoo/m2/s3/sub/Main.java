/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s3.sub;

import com.example.jaoo.m2.s3.BasicClass;

/**
 * Each package is different - hierarchy does not matter
 * <p>
 * BasicClass is not in this package, has to be imported to be used here
 * <p>
 * Being in the "super" package is not enough
 */
public class Main {
    public static void main(String[] args) {
        // Required to be imported
        BasicClass bc = new BasicClass();
        System.out.println(bc);

        Extended poodle = new Extended();
        System.out.println(poodle);

        // Won't compile: PackageClass cannot be resolved to a type
        // PackageClass pc = new PackageClass();
    }
}
