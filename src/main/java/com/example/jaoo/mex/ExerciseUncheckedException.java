/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jaoo.mex;

/**
 * Unchecked exception for exercises - not meant for serialization
 */
@SuppressWarnings("serial")
public class ExerciseUncheckedException extends RuntimeException {
    public ExerciseUncheckedException(String message) {
        super(message);
    }
}
