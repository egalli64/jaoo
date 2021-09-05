package m13.s05;

public class SingletonEnumMain {
    public static void main(String[] args) {
        System.out.println("INSTANCE life is " + SingletonEnum.INSTANCE.getLife());
        System.out.println("Life after fight is " + SingletonEnum.INSTANCE.fight(1));

        SingletonEnum se = SingletonEnum.INSTANCE;
        System.out.println("Se life is " + se.getLife());
        System.out.println("Life after fight is " + se.fight(1));
        System.out.println("INSTANCE life after se fight is " + SingletonEnum.INSTANCE.getLife());
    }
}