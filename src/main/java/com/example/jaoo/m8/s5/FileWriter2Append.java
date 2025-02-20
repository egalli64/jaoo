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
public class FileWriter2Append {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * Create a FileWriter for appending
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try (FileWriter pw = new FileWriter(FILE_NAME, true)) {
            pw.write("Hello again!");
            log.info("Append to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't append to " + FILE_NAME, e);
        }
    }
}
