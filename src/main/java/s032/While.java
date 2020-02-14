package s032;

public class While {
    public static void main(String[] args) {
        boolean condition = true;
        boolean something = true;

        while (condition) {
            System.out.println("something is true");

            if (something) {
                condition = false;
            }
        }
    }
}
