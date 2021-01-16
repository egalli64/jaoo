package m10.s04;

public class SingletonEagerMain {
	public static void main(String[] args) {
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager.fight(1));

		SingletonEager e2 = SingletonEager.getInstance();
		System.out.println(e2.fight(1));
	}
}
