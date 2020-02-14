package s030;

public class IfElseIfElse {
    public static void main(String[] args) {
        boolean condition = false;
        boolean otherCondition = true;

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
