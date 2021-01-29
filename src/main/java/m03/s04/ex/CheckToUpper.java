package m03.s04.ex;

public class CheckToUpper {
    /**
     * Sort of simple tester, see JUnit for the real stuff
     */
    public static void main(String[] args) {
        testBob();
    }

    public static void testBob() {
        Exercise ex = new Exercise();

        String input = "Bob";
        String actual = ex.toUpper(input);
        String expected = "BOB";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }
}
