package m02.s05;

public class Comparer {
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;
        System.out.println("alpha = " + alpha);
        System.out.println("beta = " + beta);
        System.out.println("gamma = " + gamma);

        boolean result = alpha < beta; // true
        System.out.println("alpha < beta? " + result);

        result = alpha < gamma; // false
        System.out.println("alpha < gamma? " + result);

        result = alpha <= gamma; // true
        System.out.println("alpha <= gamma? " + result);

        result = alpha > beta; // false
        System.out.println("alpha > beta? " + result);

        result = alpha > gamma; // false
        System.out.println("alpha > gamma? " + result);

        result = alpha >= gamma; // true
        System.out.println("alpha >= gamma? " + result);

        result = alpha == beta; // false
        System.out.println("alpha == beta? " + result);

        result = alpha == gamma; // true
        System.out.println("alpha == gamma? " + result);

        result = alpha != beta; // true
        System.out.println("alpha != beta? " + result);

        result = alpha != gamma; // false
        System.out.println("alpha != gamma? " + result);

        // For references, == is _not_ about the content
        String a = "solution";
        String b = "sol";
        String c = "ution";
        String d = b + c;

        result = a == d; // false!
        System.out.println(a + " == " + d + "? " + result);

        // Java should be smart enough to see there is already a "solution" string
        // Two references to the same object
        String e = "solution";
        result = a == e; // true!
        System.out.println(a + " == " + e + "? " + result);
    }
}
