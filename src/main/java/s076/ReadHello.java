package s076;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadHello {
	public static void main(String[] args) {
		File f = new File("/tmp/hello.txt");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			System.out.println(">" + line + "<");

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
