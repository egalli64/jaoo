package m1.s13;

public class Relational {
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;

        System.out.println("alpha < beta? " + (alpha < beta)); // true
        System.out.println(alpha + " < " + beta + " ? " + (alpha < beta)); // "12 < 21 ? true"
        System.out.println("alpha < gamma? " + (alpha < gamma)); // false
        System.out.println("alpha <= gamma? " + (alpha <= gamma)); // true

        System.out.println("alpha > beta? " + (alpha > beta)); // false
        System.out.println("alpha > gamma? " + (alpha > gamma)); // false
        System.out.println("alpha >= gamma? " + (alpha >= gamma)); // true

        System.out.println("alpha == beta? " + (alpha == beta)); // false
        System.out.println("alpha == gamma? " + (alpha == gamma)); // true

        System.out.println("alpha != beta? " + (alpha != beta)); // true
        System.out.println("alpha != gamma? " + (alpha != gamma)); // false

        // For references, == is _not_ about the content
        String a = "solution";
        String b = "sol";
        String c = "ution";
        String d = b + c;

        if (a == d) {
            System.out.println("You won't see this message");
        } else {
            System.out.println("'" + a + "' == '" + d + "' is not true");
        }

        if (a != d) {
            System.out.println("'" + a + "' != '" + d + "' is true");
        }
    }
}
