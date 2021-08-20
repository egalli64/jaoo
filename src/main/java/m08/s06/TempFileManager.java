package m08.s06;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TempFileManager {
    private static final Logger log = Logger.getGlobal();

    private static final String DEFAULT_DIR_NAME = "/tmp/";
    private static final String RELATIVE_FILE_NAME = "hello.txt";
    private static final String ABSOLUTE_FILE_NAME = DEFAULT_DIR_NAME + "hello.txt";
    private static final String ABSOLUTE_URI = "file://" + ABSOLUTE_FILE_NAME;
    private static final String ABSOLUTE_URI_WIN = "file:///C:" + ABSOLUTE_FILE_NAME;

    private static File ensureDirectory() {
        return ensureDirectory(DEFAULT_DIR_NAME);
    }

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

    public static void ensureFileExistsByAbsoluteName(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                log.info(String.format("File %s created successfully", fileName));
            } else {
                log.info(String.format("A file named %s already exists", fileName));
            }
        } catch (IOException e) {
            log.severe("Can't create " + fileName);
            throw new IllegalArgumentException(e);
        }
    }

    public static boolean isFileExistingByUri(String uri) {
        try {
            File file = new File(new URI(uri));
            return file.exists();
        } catch (URISyntaxException | SecurityException e) {
            log.log(Level.SEVERE, "Can't access " + uri, e);
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            ensureDirectory("");
        } catch (Exception e) {
            System.out.println("Use a 'good' name for the directory");
            log.log(Level.SEVERE, "Can't create TempFileManager", e);
        }

        File dir = ensureDirectory();

        ensureFileExistsByAbsoluteName(ABSOLUTE_FILE_NAME);

        File f1 = new File(DEFAULT_DIR_NAME, RELATIVE_FILE_NAME);
        if (!f1.isFile()) {
            System.out.println("Unexpected!");
        }

        File f2 = new File(dir, RELATIVE_FILE_NAME);
        if (f2.isDirectory()) {
            System.out.println("Unexpected!");
        }

        System.out.println("Checking " + ABSOLUTE_URI);
        if (!isFileExistingByUri(ABSOLUTE_URI)) {
            System.out.println("Unexpected!");
        }

        System.out.println("Checking " + ABSOLUTE_URI_WIN);
        if (!isFileExistingByUri(ABSOLUTE_URI_WIN)) {
            System.out.println("Are you using a UNIX (like) box?");
        }
    }
}
