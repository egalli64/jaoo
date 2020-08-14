package m5.s05;

import java.util.logging.Logger;

import m5.s05.pizzeria.Menu;
import m5.s05.pizzeria.Pizza;

public class FactoryMethod {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        try {
            Pizza pizza = Pizza.create(Menu.MARGHERITA);
            System.out.println("Here is your pizza: " + pizza);

            pizza = Pizza.create(Menu.MARGHERITA_RUCOLA);
            System.out.println("Here is your pizza: " + pizza);

            pizza = Pizza.create(Menu.MARE_E_MONTI);
            System.out.println("Here is your pizza (actually, not): " + pizza);
        } catch (Exception ex) {
            LOG.severe("Can't create pizza: " + ex.getMessage());
        }
    }
}
