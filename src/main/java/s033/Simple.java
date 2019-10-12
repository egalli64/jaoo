package s033;

public class Simple {
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;

        System.out.println("alpha < beta? " + (alpha < beta)); // true
        System.out.println("alpha < gamma? " + (alpha < gamma)); // false
        System.out.println("alpha <= gamma? " + (alpha <= gamma)); // true

        System.out.println("alpha > beta? " + (alpha > beta)); // false
        System.out.println("alpha > gamma? " + (alpha > gamma)); // false
        System.out.println("alpha >= gamma? " + (alpha >= gamma)); // true

        System.out.println("alpha == beta? " + (alpha == beta)); // false
        System.out.println("alpha == gamma? " + (alpha == gamma)); // true

        System.out.println("alpha != beta? " + (alpha != beta)); // true
        System.out.println("alpha != gamma? " + (alpha != gamma)); // false
    }
}
