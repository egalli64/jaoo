package m02.s08;

public class SwitchArgs {
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("No arg passed in");
            break;
        case 1:
            System.out.println("A single arg passed: " + args[0]);
            break;
        case 2:
            System.out.println("The second arg passed: " + args[1]);
            break;
        default:
            System.out.println("The last arg passed: " + args[args.length - 1]);
            break;
        }

        System.out.println("-- done --");
    }
}
