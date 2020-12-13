package m08.s10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadHello {
    public static void main(String[] args) {
        File f = new File("/tmp/hello.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            System.out.println(">" + line + "<");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
