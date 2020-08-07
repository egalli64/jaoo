package m5.s05.pizzeria;

public class Margherita extends Pizza {
	String extra = "";
	
	public Margherita() {
	}

	public Margherita(boolean rucola) {
		if(rucola) {
			extra = "rucola";
		}
	}
	
	@Override
	public String toString() {
		return "margherita " + extra;
	}
}
