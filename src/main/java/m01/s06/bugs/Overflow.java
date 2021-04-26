package m01.s06.bugs;

public class Overflow {
    public static void main(String[] args) {
        int[] accounts = { 1_000_000_001, 1_000_000_002, 1_000_000_003, 1_000_000_004 };

        int total = accounts[0];
        total = total + accounts[1];
        total = total + accounts[2];
        total = total + accounts[3];

        System.out.println(total);
    }
}
