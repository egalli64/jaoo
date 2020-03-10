package s046;

public class Scope {
    private static int staticMember = 5;
    private long member = 5;

    public void f() {
        int local = 7;
        if (staticMember == 2) {
//            float local = 0.0F;
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }

    public static void main(String[] args) {
        double local = 5;
        System.out.println(local);
        staticMember = 12;
    }
}
