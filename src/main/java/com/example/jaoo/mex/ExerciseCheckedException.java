/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
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
