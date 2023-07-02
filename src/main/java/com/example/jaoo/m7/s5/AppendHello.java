/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Writing to File
 */
public class AppendHello {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * PrintWriter, FileOutputStream
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(FILE_NAME, true));
            pw.print("More ");
            pw.println("hello!");
            pw.append("Hello again!");
            log.info("Append to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't append to " + FILE_NAME, e);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
