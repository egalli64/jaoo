package m02.s06;

public class Bitwise {
    public static void main(String[] args) {
        int gamma = 0b101; // 5
        int delta = 0b110; // 6
        System.out.println("gamma is " + gamma);
        System.out.println("delta is " + delta);

        // 0101 & 0110 -> 0100 (4)
        int epsilon = gamma & delta;
        System.out.println("gamma & delta is " + epsilon);

        // 0101 | 0110 -> 0111 (7)
        epsilon = gamma | delta;
        System.out.println("gamma | delta is " + epsilon);

        // 0101 ^ 0110 -> 0011 (3)
        epsilon = gamma ^ delta;
        System.out.println("gamma ^ delta is " + epsilon);

        // ~0101 -> [11111111] [11111111] [11111111] [11111010] (-6)
        int zeta = ~gamma;
        System.out.println("~gamma is " + zeta);

        int rho = zeta >> 1;
        System.out.println("right shift: " + rho);
        rho = zeta >>> 1;
        System.out.println("right shift (sign is shifting, too!): " + rho);
        rho = zeta << 1;
        System.out.println("left shift: " + rho);
    }
}
