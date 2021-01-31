package m03.s04.ex;

public class CheckCaesar {
    /**
     * Sort of simple tester, see JUnit for the real stuff
     */
    public static void main(String[] args) {
        testCiao1();
        testDjbpMinus1();
        testAppMinus1();
        testAppMinus27();
        testZoo1();
        testZoo27();
    }

    public static void testCiao1() {
        Exercise ex = new Exercise();

        String input = "CIAO";
        String actual = ex.caesarEncrypt(input, 1);
        String expected = "DJBP";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void testDjbpMinus1() {
        Exercise ex = new Exercise();

        String input = "DJBP";
        String actual = ex.caesarEncrypt(input, -1);
        String expected = "CIAO";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void testZoo1() {
        Exercise ex = new Exercise();

        String input = "ZOO";
        String actual = ex.caesarEncrypt(input, 1);
        String expected = "APP";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void testAppMinus1() {
        Exercise ex = new Exercise();

        String input = "APP";
        String actual = ex.caesarEncrypt(input, -1);
        String expected = "ZOO";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void testZoo27() {
        Exercise ex = new Exercise();

        String input = "ZOO";
        String actual = ex.caesarEncrypt(input, 27);
        String expected = "APP";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void testAppMinus27() {
        Exercise ex = new Exercise();

        String input = "APP";
        String actual = ex.caesarEncrypt(input, -27);
        String expected = "ZOO";
        if (!actual.equals(expected)) {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }
}
