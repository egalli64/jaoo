/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Writing to File by FileWriter
 */
public class FileWriter1Override {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * Create a FileWriter for overwriting
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            fw.write("Hello, hello!");
            log.info("Write to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't write to " + FILE_NAME, e);
        }
    }
}
