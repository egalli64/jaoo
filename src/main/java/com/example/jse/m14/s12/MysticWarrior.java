package com.example.jse.m14.s12;

public class MysticWarrior implements Fighter, Healer {
    private static final int HEALING_POWER = 2;
    private Warrior warrior;

    public MysticWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public void heal(Actor target) {
        target.addLife(HEALING_POWER);
    }

    /**
     * Auto healing
     */
    public void heal() {
        heal(this.warrior);
    }

    @Override
    public boolean fight(Actor other) {
        return warrior.fight(other);
    }

}
