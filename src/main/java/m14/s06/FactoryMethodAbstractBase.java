package m14.s06;

public abstract class FactoryMethodAbstractBase {
    public static FactoryMethodAbstractBase create(String type) {
        switch (type) {
        case "A":
            return new A();
        case "B":
            return new B();
        default:
            throw new IllegalArgumentException("Type not available");
        }
    }

}
