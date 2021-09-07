package m06.s13;

public interface InterfaceTwo {
    default void aMethod() {
        System.out.println("Goodbye");
    }
}
