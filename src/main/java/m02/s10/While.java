package m02.s10;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println("Arg " + i + ": " + args[i]);
            i += 1;
        }

        System.out.println("done!");
    }
}
