package mx;

public class ExUncheckedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExUncheckedException(String message) {
        super(message);
    }
}
