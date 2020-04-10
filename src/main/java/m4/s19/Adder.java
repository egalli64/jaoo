package m4.s19;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }
            }
        }

        System.out.println("Total is " + result);
    }
}
