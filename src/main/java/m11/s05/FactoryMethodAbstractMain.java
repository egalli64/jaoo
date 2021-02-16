package m11.s05;

public class FactoryMethodAbstractMain {
    public static void main(String[] args) {
        FactoryMethodAbstractBase a = FactoryMethodAbstractBase.create("A");
        if (a instanceof A) {
            System.out.println("As expected, a instantiates " + a.getClass().getSimpleName());
        } else {
            System.out.println("Unexpected!");
        }

        FactoryMethodAbstractBase b = FactoryMethodAbstractBase.create("B");
        if (b instanceof B) {
            System.out.println("As expected, b instantiates " + b.getClass().getSimpleName());
        } else {
            System.out.println("Unexpected!");
        }

        try {
            FactoryMethodAbstractBase.create("C");
            System.out.println("Unexpected!");
        } catch (IllegalArgumentException iae) {
            System.out.println("As expected for C: " + iae.getMessage());
        }
    }
}
