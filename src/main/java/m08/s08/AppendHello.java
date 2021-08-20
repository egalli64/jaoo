package m08.s08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppendHello {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

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
