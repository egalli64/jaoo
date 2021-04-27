package m01.s04;

public class Variable {
    public static void main(String[] args) {
        int aPrimitiveVariable = 42;
        String aReferenceVariable = "42";

        System.out.println(aReferenceVariable);
        System.out.println(aPrimitiveVariable);

        // Dangerous! Beware of null!
        String noReference = null;
        System.out.println(noReference);

        // Java 10 inferred type
        var anotherPrimitiveVariable = 12;
        var anotherReferenceVariable = "Tom";

        System.out.println(anotherReferenceVariable);
        System.out.println(anotherPrimitiveVariable);

        final int A_CONSTANT = 12;
        final var ANOTHER_CONSTANT = 21;
        System.out.println(A_CONSTANT + ANOTHER_CONSTANT);

        // a final variable can't change!
//        A_CONSTANT = 42;
    }
}
