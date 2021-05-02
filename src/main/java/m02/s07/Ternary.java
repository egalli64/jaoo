package m02.s07;

public class Ternary {
    public static void main(String[] args) {
        String version1 = args.length == 0 ? "No arg passed" : args[1];
        System.out.println(version1);

        String version2;
        if (args.length == 0) {
            version2 = "No arg passed";
        } else {
            version2 = args[1];
        }
        System.out.println(version2);
    }
}
