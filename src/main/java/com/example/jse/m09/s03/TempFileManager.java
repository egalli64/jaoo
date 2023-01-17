/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m09.s03;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * File
 */
public class TempFileManager {
    private static final Logger log = Logger.getGlobal();

    private static final String DEFAULT_DIR_NAME = "/tmp/";
    private static final String RELATIVE_FILE_NAME = "hello.txt";
    private static final String ABSOLUTE_FILE_NAME = DEFAULT_DIR_NAME + "hello.txt";
    private static final String ABSOLUTE_URI = "file://" + ABSOLUTE_FILE_NAME;
    private static final String ABSOLUTE_URI_WIN = "file:///C:" + ABSOLUTE_FILE_NAME;

    /**
     * A tour of java io File functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String badFileName = "";
        try {
            ensureDirectory(badFileName);
        } catch (Exception e) {
            System.out.println("\"" + badFileName + "\" is not a 'good' name for the temp directory");
            log.log(Level.SEVERE, "Can't create TempFileManager", e);
        }

        File dir = ensureDirectory();
        System.out.println("\"" + DEFAULT_DIR_NAME + "\" is a 'good' directory");

        ensureFileExistsByAbsoluteName(ABSOLUTE_FILE_NAME);

        try {
            ensureFileExistsByAbsoluteName(badFileName);
        } catch (IllegalArgumentException ex) {
            String message = "Can't check file named \"" + badFileName + "\"";
            System.out.println(message);
            log.log(Level.SEVERE, message, ex);
        }

        File f1 = new File(DEFAULT_DIR_NAME, RELATIVE_FILE_NAME);
        System.out.print("Checking " + f1 + " ... ");
        if (!f1.isFile()) {
            System.out.println("failed!");
        } else {
            System.out.println("passed");
        }

        File f2 = new File(dir, RELATIVE_FILE_NAME);
        System.out.print("Checking " + f2 + " ... ");
        if (f2.isDirectory()) {
            System.out.println("failed!");
        } else {
            System.out.println("passed");
        }

        System.out.print("Checking " + ABSOLUTE_URI + " ... ");
        if (isFileExistingByUri(ABSOLUTE_URI)) {
            System.out.println("passed");
        } else {
            System.out.println("failed!");
        }

        System.out.print("Checking " + ABSOLUTE_URI_WIN + " ... ");
        if (isFileExistingByUri(ABSOLUTE_URI_WIN)) {
            System.out.println("passed");
        } else {
            System.out.println("failed. Are you using a UNIX (like) box?");
        }
    }

    /**
     * Hack to provide a functionality like default parameter
     * 
     * @return reference to File for the default directory
     */
    private static File ensureDirectory() {
        return ensureDirectory(DEFAULT_DIR_NAME);
    }

    /**
     * Try to create directory File with the passed filename
     * 
     * @param dirName the required directory
     * @return a File representing the required directory
     * @throws IllegalArgumentException bad directory name
     */
    private static File ensureDirectory(String dirName) {
        File result = new File(dirName);
        if (result.mkdir()) {
            log.info(String.format("Directory %s created successfully", dirName));
        } else {
            log.warning("Can't create directory " + dirName);
        }

        if (!result.isDirectory()) {
            throw new IllegalArgumentException(String.format("'%s' can't be accessed as a directory", dirName));
        }

        return result;
    }

    /**
     * Ensure a file with the passed filename exists (maybe creating it)
     * 
     * @param fileName a filename
     * @throws IllegalArgumentException in case of failure
     */
    private static void ensureFileExistsByAbsoluteName(String fileName) {
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                log.info(String.format("File %s created successfully", fileName));
            } else {
                log.info(String.format("A file named %s already exists", fileName));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Check if the passed URI is relative to an actual file
     * 
     * @param uri file URI
     * @return true if exists
     */
    private static boolean isFileExistingByUri(String uri) {
        try {
            File file = new File(new URI(uri));
            return file.exists();
        } catch (URISyntaxException | SecurityException e) {
            log.log(Level.SEVERE, "Can't access " + uri, e);
            return false;
        }
    }
}
