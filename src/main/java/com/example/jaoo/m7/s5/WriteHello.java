/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Writing to File
 */
public class WriteHello {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * PrintWriter
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(FILE_NAME);
            pw.print("Hello, ");
            pw.println("hello!");
            pw.append("Hello again!");
            log.info("Write to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't write to " + FILE_NAME, e);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
