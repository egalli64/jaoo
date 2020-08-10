package m2.s20ex;

public class Wizard extends Actor {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public boolean fight(Actor enemy) {
        return false;
    }
}
