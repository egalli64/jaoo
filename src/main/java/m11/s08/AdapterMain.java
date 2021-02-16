package m11.s08;

public class AdapterMain {
    public static void main(String[] args) {
        CoffeeMachineLegacy ocm = new CoffeeMachineLegacy();

        CoffeeMachineAdapter cta = new CoffeeMachineAdapter(ocm);

        System.out.println("Selecting the first one");
        cta.select1();

        System.out.println("Selecting the second one");
        cta.select2();
    }
}
