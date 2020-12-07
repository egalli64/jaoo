package m01.s04;

public class Variable {
    public static void main(String[] args) {
        int aPrimitive = 42;
        String aReference = "42";

        System.out.println(aReference);
        System.out.println(aPrimitive);

        // Dangerous! Beware of null!
        String noReference = null;
        System.out.println(noReference);

        // Java 10 inferred type
        var anotherPrimitive = 12;
        var anotherReference = "Tom";

        System.out.println(anotherReference);
        System.out.println(anotherPrimitive);

        final int A_CONSTANT = 12;
        final var ANOTHER_CONSTANT = 21;
        System.out.println(A_CONSTANT + ANOTHER_CONSTANT);
    }
}
