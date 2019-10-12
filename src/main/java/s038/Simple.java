package s038;

public class Simple {
    public static void main(String[] args) {
        boolean alpha = true;
        boolean beta = false;

        System.out.println(alpha && beta); // false
        System.out.println(alpha || beta); // true
        System.out.println(!alpha); // false
        System.out.println(alpha & beta); // false
        System.out.println(alpha | beta); // true

        int gamma = 0b101; // 5
        int delta = 0b110; // 6

        System.out.println(gamma & delta); // 4 == 0100
        System.out.println(gamma | delta); // 7 == 0111
        System.out.println(gamma ^ delta); // 3 == 0011
    }
}
