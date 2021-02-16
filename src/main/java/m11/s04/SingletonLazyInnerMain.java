package m11.s04;

public class SingletonLazyInnerMain {
    public static void main(String[] args) {
        SingletonLazyInner sli = SingletonLazyInner.getInstance();

        System.out.println(sli.fight(1));
        System.out.println(SingletonLazyInner.getInstance().fight(1));
    }
}
