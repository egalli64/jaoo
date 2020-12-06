package m02.s06;

public class Bitwise {
    public static void main(String[] args) {
        int gamma = 0b101; // 5
        int delta = 0b110; // 6
        System.out.println("gamma is " + gamma);
        System.out.println("delta is " + delta);

        // 0101 & 0110 -> 0100 (4)
        int result = gamma & delta;
        System.out.println("gamma & delta is " + result);

        // 0101 | 0110 -> 0111 (7)
        result = gamma | delta;
        System.out.println("gamma | delta is " + result);

        // 0101 ^ 0110 -> 0011 (3)
        result = gamma ^ delta;
        System.out.println("gamma ^ delta is " + result);

        // ~0101 -> [11111111] [11111111] [11111111] [11111010] (-6)
        result = ~gamma;
        System.out.println("~gamma is " + result);
    }
}
