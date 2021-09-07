package m06.s13;

public interface InterfaceOne {
    default void aMethod() {
        System.out.println("Hello");
    }
}
