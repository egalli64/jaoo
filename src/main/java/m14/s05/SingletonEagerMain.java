package m14.s05;

public class SingletonEagerMain {
	public static void main(String[] args) {
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println("Eager life is " + eager.getLife());
		System.out.println("Life after fight is " + eager.fight(1));

		SingletonEager e2 = SingletonEager.getInstance();
		System.out.println("E2 life is " + e2.getLife());
		System.out.println("Life after fight is " + e2.fight(1));
		System.out.println("Eager life after e2 fight is " + eager.getLife());
	}
}
