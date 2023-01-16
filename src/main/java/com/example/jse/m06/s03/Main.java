/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s03;

import com.example.jse.m06.s03.sub.Extended;

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
