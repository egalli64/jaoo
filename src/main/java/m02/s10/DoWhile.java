package m02.s10;

public class DoWhile {
    public static void main(String[] args) {
        boolean condition = true;
        boolean something = args.length == 0;

        do {
            System.out.println("something is " + something);

            if (something) {
                condition = false;
            }
        } while (condition);
    }
}
