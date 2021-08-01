package m06.s03;

import m06.s03.sub.Extended;

public class Main {
    public static void main(String[] args) {
        BasicClass bc = new BasicClass();
        System.out.println(bc);

        PackageClass pc = new PackageClass();
        System.out.println(pc);

        Extended ext = new Extended();
        System.out.println(ext);
    }
}
