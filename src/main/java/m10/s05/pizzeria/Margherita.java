package m10.s05.pizzeria;

public class Margherita extends Pizza {
    private boolean rucola;

    public Margherita() {
        this.rucola = false;
    }

    public Margherita(boolean rucola) {
        this.rucola = rucola;
    }

    @Override
    public String toString() {
        return rucola ? "Rucola" : this.getClass().getSimpleName();
    }
}
