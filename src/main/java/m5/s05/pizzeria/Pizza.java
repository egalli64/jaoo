package m5.s05.pizzeria;

public class Pizza {
	public static Pizza create(Menu menu) {
		switch(menu) {
		case MARGHERITA:
			return new Margherita();
		case MARGHERITA_RUCOLA:
			return new Margherita(true);
		default:
			throw new IllegalArgumentException("Currently not available");
		}
	}
	
	protected Pizza() {		
	}
	
	protected Pizza(boolean special) {		
	}
}
