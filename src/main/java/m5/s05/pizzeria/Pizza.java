package m5.s05.pizzeria;

public class Pizza {
    public static Pizza create(Menu menu) {
        switch (menu) {
        case MARGHERITA:
            return new Margherita();
        case MARGHERITA_RUCOLA:
            return new Margherita(true);
        default:
            throw new IllegalArgumentException(menu + " currently not available");
        }
    }

    protected Pizza() {
    }
}
