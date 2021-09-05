package m13.s09;

public class CoffeeMachineAdapter implements CoffeeMachine {
    private CoffeeMachineLegacy ocm;

    public CoffeeMachineAdapter(CoffeeMachineLegacy ocm) {
        this.ocm = ocm;
    }

    @Override
    public void select1() {
        ocm.selectA();
    }

    @Override
    public void select2() {
        ocm.selectB();
    }

}
