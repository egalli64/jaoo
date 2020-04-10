package m2.s27;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(5 + 7);
        System.out.println(5 + "7");
        
        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        System.out.println("Vogons".repeat(3)); // Java 11
    }
    
    static void f(String a, int b, String c) {
        System.out.println(a + b + c);
    }
}
