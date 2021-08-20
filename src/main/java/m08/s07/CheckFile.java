package m08.s07;

import java.io.File;
import java.util.Arrays;

public class CheckFile {
    private static final String ABSOLUTE_FILE_NAME = "/tmp/hello.txt";
    private static final String DIR_NAME = "/tmp/";

    public static void main(String[] args) {
        File f1 = new File(ABSOLUTE_FILE_NAME);

        System.out.println("Is the file hidden? " + f1.isHidden());
        System.out.println("For the current (UNIX) user ...");
        System.out.println(" Is the file readable? " + f1.canRead());
        System.out.println(" Is the file writable? " + f1.canWrite());
        System.out.println("Length: " + f1.length());

        System.out.println("Is the file name absolute? " + f1.isAbsolute() + " (Win requires the drive!)");

        System.out.println("Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Absolute path: " + f1.getAbsolutePath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println("Last modified: " + f1.lastModified());

        File dir = new File(DIR_NAME);
        System.out.println("List: " + Arrays.toString(dir.list()));
    }
}
