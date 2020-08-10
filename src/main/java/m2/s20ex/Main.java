package m2.s20ex;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Wizard("Tom"), new Warrior("Bill") /* , ... */ };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		for (Actor actor : actors) {
			for (Actor enemy : actors) {
				if (actor != enemy) {
					// ...
				}
			}
		}
	}
}
