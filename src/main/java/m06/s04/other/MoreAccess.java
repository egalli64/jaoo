package m06.s04.other;

import m06.s04.Access;

public class MoreAccess extends Access {
    void f() {
        // super's protected members are accessible
        System.out.println(b);

        // super's private members are _not_ accessible
//        System.out.println(a);

        // super's package members are _not_ accessible
//        System.out.println(Access.c);
    }
}
