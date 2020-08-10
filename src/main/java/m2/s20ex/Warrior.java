package m2.s20ex;

public class Warrior extends Actor {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public boolean fight(Actor enemy) {
        return false;
    }
}
