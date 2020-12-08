package m06.s04;

public class AnotherAccess {
    void f() {
        Access access = new Access();
        // we can't see private members of super
//        System.out.println(access.a);

        // we can see super's protected members
        System.out.println(access.b);

        // we can't see package members of super
        System.out.println(Access.c);
    }
}
