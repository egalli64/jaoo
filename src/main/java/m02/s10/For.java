package m02.s10;

public class For {
    public static void main(String[] args) {
        System.out.println("Please, pass a few args");
        for (int i = 0; i < args.length; i++) {
            System.out.print("Arg " + i);

            if (i == 2) {
                System.out.println(" skipped");
                continue;
            }

            System.out.println(": " + args[i]);
        }

        System.out.println("done!");
    }
}
