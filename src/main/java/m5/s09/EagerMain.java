package m5.s09;

public class EagerMain {
	public static void main(String[] args) {
		Eager eager = Eager.getInstance();
		System.out.println(eager.fight(1));

		Eager e2 = Eager.getInstance();
		System.out.println(e2.fight(1));
	}
}
