package m02.s07;

public class IfElseIfElse {
    public static void main(String[] args) {
        boolean condition = args.length != 0;
        boolean otherCondition = args.length == 1;

        if (condition) {
            System.out.println("only if condition is true");
        } else if (otherCondition) {
            System.out.println("only if condition is false and otherCondition is true");
        } else {
            System.out.println("condition and otherCondition are both false");
        }

        System.out.println("always printed");
    }
}
