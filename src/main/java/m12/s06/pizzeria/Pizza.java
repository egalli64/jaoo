package m12.s06.pizzeria;

public abstract class Pizza {
    public static Pizza create(PizzaType menu) {
        switch (menu) {
        case MARGHERITA:
            return new Margherita();
        case RUCOLA:
            return new Margherita(true);
        default:
            throw new IllegalArgumentException(menu + " currently not available");
        }
    }
}
