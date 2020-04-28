package m6.s11;

public class MysticWarrior implements Fighter, Healer {
    private Warrior warrior;
    private int healing = 8;

    public MysticWarrior(Warrior warrior) {
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
