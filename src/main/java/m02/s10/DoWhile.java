package m02.s10;

public class DoWhile {
    public static void main(String[] args) {
        boolean condition = false;
        boolean something = true;

        do {
            System.out.println("something is true");

            if (something) {
                condition = false;
            }
        } while (condition);
    }
}
