package m6.s10;

public class MagicWarrior implements Fighter, Wizard {
    private Warrior warrior;
    private int healing = 8;

    public MagicWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public int heal() {
        return healing;
    }

    @Override
    public int fight() {
        return warrior.fight();
    }
}
