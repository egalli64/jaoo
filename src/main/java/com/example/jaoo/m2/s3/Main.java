/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s3;

import com.example.jaoo.m2.s3.sub.Extended;

/**
 * Accessing classes
 */
public class Main {
    /**
     * Classes in the current package are always accessible. Class in other packages
     * should be public and need to be imported.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        BasicClass bc = new BasicClass();
        System.out.println(bc);

        PackageClass pc = new PackageClass();
        System.out.println(pc);

        // Being in another package (doesn't matter it's a sub), requires import
        Extended ext = new Extended();
        System.out.println(ext);
    }
}
