package m11.s04;

public class SingletonEnumMain {
    public static void main(String[] args) {
        SingletonEnum se = SingletonEnum.INSTANCE;

        System.out.println(se.fight(1));
        System.out.println(SingletonEnum.INSTANCE.fight(1));
    }
}