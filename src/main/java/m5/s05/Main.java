package m5.s05;

import m5.s05.pizzeria.Menu;
import m5.s05.pizzeria.Pizza;

public class Main {
	public static void main(String[] args) {
		Pizza margherita = Pizza.create(Menu.MARGHERITA);
		System.out.println("You ordered a pizza " + margherita);

		Pizza m2 = Pizza.create(Menu.MARGHERITA_RUCOLA);
		System.out.println("You ordered a pizza " + m2);

		try {
			Pizza maremonti = Pizza.create(Menu.MARE_E_MONTI);
			System.out.println("You ordered a pizza " + maremonti);
		} catch (Exception ex) {
			System.out.println("Can't give you that pizza: " + ex.getMessage());
		}

	}
}
