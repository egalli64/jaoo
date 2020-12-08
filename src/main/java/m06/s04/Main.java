package m06.s04;

public class Main {
    public static void main(String[] args) {
        Access access = new Access();

        // super's private members are _not_ accessible
//      System.out.println(access.a);

        // super's protected members are accessible
        System.out.println("b: " + access.b);

        // super's package members are accessible
        System.out.println("c: " + Access.c);
    }
}
