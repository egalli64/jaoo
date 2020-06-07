package m4.s15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteHello {
    public static void main(String[] args) {
        File f = new File("/tmp/hello.txt");

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(f));
            pw.println("hello");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
