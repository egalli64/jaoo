package m1.s12;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(5 + 7);
        System.out.println(5 + "7");

        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        System.out.println("Vogons".repeat(3)); // Java 11

        String s = "Hello";
        s += 3;
        // s = s + 3;
        System.out.println(s);
    }
}
