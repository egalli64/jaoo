package m02.s10;

public class While {
    public static void main(String[] args) {
        boolean condition = true;
        boolean something = args.length == 0;

        while (condition) {
            System.out.println("something is true");

            if (something) {
                condition = false;
            }
        }
    }
}
