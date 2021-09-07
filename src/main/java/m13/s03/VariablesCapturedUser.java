package m13.s03;

public class VariablesCapturedUser {
    public static void executor(Runnable runnable) {
        System.out.print("The executor receives a lambda and run it: ");
        runnable.run();
    }
}
