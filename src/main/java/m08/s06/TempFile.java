package m08.s06;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class TempFile {
    public static void main(String[] args) {
        String dirName = "/tmp";

        File dir = new File(dirName);

        if (dir.mkdir()) {
            System.out.println(String.format("Directory %s created successfully", dirName));
        } else {
            System.out.println("Can't create directory " + dirName);
        }

        String fileName = "/tmp/hello.txt";
        File f1 = new File(fileName);
        try {
            if (f1.createNewFile()) {
                System.out.println(String.format("File %s created successfully", fileName));
            } else {
                System.out.println("Can't create file " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f2 = new File(dirName, "hello.txt");
        File f3 = new File(dir, "hello.txt");

        try {
            File f4 = new File(new URI("file:///tmp/hello.txt"));
            System.out.println("Does the file exist? " + f4.exists());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        System.out.println("Is /tmp a directory? " + dir.isDirectory());
        System.out.println("Is /tmp/hello.txt a file? " + f1.isFile());
        System.out.println("Is /tmp/hello.txt hidden? " + f2.isHidden());
        System.out.println("Can /tmp/hello.txt be read? " + f3.canRead());
        System.out.println("Can /tmp/hello.txt be written? " + f1.canWrite());
        System.out.println("Can /tmp/hello.txt be executed? " + f2.canExecute());
        System.out.println("Is c:/tmp/hello.txt absolute? " + f1.isAbsolute());
        System.out.println("Is /tmp/hello.txt absolute? " + f2.isAbsolute());

        System.out.println("Name: " + f1.getName());
        System.out.println("Path: " + f2.getPath());
        System.out.println("Absolute path: " + f2.getAbsolutePath());
        System.out.println("Parent: " + f3.getParent());
        System.out.println("Last modified: " + f1.lastModified());
        System.out.println("Length: " + f1.length());
        System.out.println("List: " + Arrays.toString(dir.list()));
    }
}
