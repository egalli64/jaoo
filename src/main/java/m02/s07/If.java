package m02.s07;

public class If {
    public static void main(String[] args) {
        // condition is true when no argument is passed
        boolean condition = args.length == 0;

        if (condition) {
            System.out.println("only if condition is true");
        }

        System.out.println("always printed");
    }
}
