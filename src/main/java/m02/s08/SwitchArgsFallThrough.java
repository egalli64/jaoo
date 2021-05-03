package m02.s08;

public class SwitchArgsFallThrough {
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("No arg passed in");
            break;
        case 3:
            System.out.println("Third arg passed: " + args[2]);
            // FALL THROUGH
        case 2:
            System.out.println("Second arg passed: " + args[1]);
            // FALL THROUGH
        case 1:
            System.out.println("First arg passed: " + args[0]);
            break;
        default:
            System.out.println("More than three args passed");
            break;
        }

        System.out.println("-- done --");
    }
}
