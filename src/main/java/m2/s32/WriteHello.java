package m2.s32;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteHello {
    public static void main(String[] args) {
        File f = new File("/tmp/hello.txt");

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            pw.println("hello");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
