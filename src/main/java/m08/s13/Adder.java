package m08.s13;

import java.util.Scanner;
import java.util.logging.Logger;

public class Adder {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                    log.info("Current result is " + result);
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }
            }
        }

        System.out.println("Total is " + result);
    }
}
