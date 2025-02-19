/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple example of reading bytes from file
 */
public class BinaryStream2Read {
    private static final Logger log = Logger.getGlobal();
    private static final String FILENAME = "file.dat";

    public static void main(String[] args) {
        System.out.printf("Reading from %s: ", FILENAME);

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILENAME);

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    log.log(Level.SEVERE, "Can't close " + FILENAME, e);
                }
            }
        }

        System.out.println("done!");
    }
}
