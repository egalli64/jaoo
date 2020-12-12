package m07.s03;

public class Exceptional {
    public void aCheckedThrower() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    public void anUncheckedThrower() {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    public void anotherUncheckedThrower() throws IllegalStateException {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    private boolean somethingUnexpected() {
        return true;
    }
}
