/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple example of writing bytes to file
 */
public class BinaryStream1Write {
    private static final Logger log = Logger.getGlobal();
    private static final String FILENAME = "file.dat";

    public static void main(String[] args) {
        System.out.printf("Writing to %s: ", FILENAME);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(FILENAME);
            for (byte b = 0; b < 10; b++) {
                System.out.print(b + " ");
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    log.log(Level.SEVERE, "Can't close " + FILENAME, e);
                }
            }
        }

        System.out.println("done!");
    }
}
