package m3.s20;

public class Exceptional {
    public void f() {
        // ...

        // ...
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        } finally {
            cleanup();
        }
    }

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        Exceptional exceptional = new Exceptional();
        exceptional.f();

        try {
            exceptional.g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
