/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reading from File
 */
public class Reader2Buffered {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * BufferedReader, FileReader
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        File f = new File(FILE_NAME);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            System.out.println(">" + line + "<");

            System.out.println("***");
            int cur;
            while ((cur = br.read()) != -1) {
                char c = (char) cur;
                if (c == '\n') {
                    System.out.println();
                } else if (c != '\r') {
                    System.out.print("_");
                    System.out.print(c);
                    System.out.print("_");
                }
            }
            System.out.println();

            log.info("Done reading from " + FILE_NAME);
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't read from " + FILE_NAME, e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                log.log(Level.SEVERE, "Can't close on " + FILE_NAME, e);
            }
        }
    }
}
