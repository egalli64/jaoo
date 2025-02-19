/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

import java.util.Comparator;

/**
 * An alternative comparator for the comparable Dog class
 * <p>
 * Check first the age, older dog first, than owner name, than dog name
 */
public class CustomDogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog left, Dog right) {
        int ageComparison = Integer.compare(right.getAge(), left.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        int ownerComparison = left.getOwner().compareTo(right.getOwner());
        if (ownerComparison != 0) {
            return ownerComparison;
        }

        return left.getName().compareTo(right.getName());
    }
}
