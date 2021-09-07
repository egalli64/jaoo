package m13.s03;

public class VariablesCapturedExample {
    private static int classValue = 42;
    private double instanceValue = Math.E;

    private void capturing() {
        double local = Math.PI;

        // a lambda that captures an instance property
        Runnable r1 = () -> System.out.println(instanceValue);
        VariablesCapturedUser.executor(r1);

        // a lambda that captures a static data member
        Runnable r2 = () -> System.out.println(classValue);
        VariablesCapturedUser.executor(r2);

        // a lambda that captures a local variable
        Runnable r3 = () -> System.out.println(local);
        VariablesCapturedUser.executor(r3);

        System.out.println("Modifying the class variable: " + ++classValue);
        System.out.println("Modifying the instance variable: " + ++instanceValue);

        // Local variable local defined in an enclosing scope must be final or effectively final
        // System.out.println("Modifying the local variable: " + ++local); // won't work
    }

    public static void main(String[] args) {
        new VariablesCapturedExample().capturing();
    }
}
