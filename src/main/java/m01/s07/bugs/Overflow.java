package m01.s07.bugs;

public class Overflow {
    public static void main(String[] args) {
        int bob = 1_000_000_001;
        int tom = 1_000_000_002;
        int kim = 1_000_000_003;
        int jon = 1_000_000_004;

        int total = bob + tom + kim + jon;

        System.out.println(total);
    }
}
