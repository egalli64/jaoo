package m06.s10;

public class Wolf implements WolfBehavior {
    @Override
    public void howl() {
        System.out.println("Woul");
    }

    @Override
    public String toString() {
        return "A Wolf";
    }
}
