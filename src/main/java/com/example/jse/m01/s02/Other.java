/*
 * Another class - this one could be used only in the current package
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s02;

import com.example.jse.m01.s05.Variable;
import com.example.jse.m01.s07.*;

class Other {
    /**
     * Print the name of:
     * <li>The current class
     * <li>Another class in the same package (does not require import)
     * <li>A class in another package - imported explicitly
     * <li>A class in another package - imported implicitly with all its package
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println(Other.class);
        System.out.println(PackageClass.class);
        System.out.println(Variable.class);
        System.out.println(Widening.class);
    }
}
