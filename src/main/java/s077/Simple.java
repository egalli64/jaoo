package s077;

public class Simple {
    public int negate(int value) {
        if (value == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Can't negate MIN_VALUE");
        }
        return -value;
    }

    public int negate2(int value) throws MyNegateException {
        if (value == Integer.MIN_VALUE) {
            throw new MyNegateException(Integer.MAX_VALUE);
        }
        return -value;
    }
    
    public static void main(String[] args) {
        Simple simple = new Simple();
        System.out.println("Negate " + Integer.MIN_VALUE);
        try {
            int x = simple.negate2(Integer.MIN_VALUE);
            System.out.println("My value negated is: " + x);
        } catch(MyNegateException mne) {
            System.out.println("My value negated is close to: "
                    + mne.getAlternativeValue());            
        }
    }
}

class MyNegateException extends Exception {
    private static final long serialVersionUID = 1L;
    private int alternativeValue;
    
    public MyNegateException(int alternativeValue) {
        this.alternativeValue = alternativeValue;
    }
    
    public int getAlternativeValue() {
        return alternativeValue;
    }
}
