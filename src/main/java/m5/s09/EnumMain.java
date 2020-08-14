package m5.s09;

public class EnumMain {
    public static void main(String[] args) {
        EnumEager ee = EnumEager.INSTANCE;

        System.out.println(ee.solution());

        EnumEager.INSTANCE.solution();
    }
}