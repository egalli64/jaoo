/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex;

/**
 * Checked exception for exercises - not meant for serialization
 */
@SuppressWarnings("serial")
public class ExerciseCheckedException extends Exception {
    public ExerciseCheckedException(String message) {
        super(message);
    }
}
