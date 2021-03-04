package m07.s06;

public class MyNegateException extends Exception {
    private static final long serialVersionUID = 1L;
    private final int alternativeValue;

    public MyNegateException(int alternativeValue) {
        this.alternativeValue = alternativeValue;
    }

    public int getAlternativeValue() {
        return alternativeValue;
    }
}