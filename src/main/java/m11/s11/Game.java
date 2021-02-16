package m11.s11;

import java.util.logging.Logger;

public class Game {
    private static final Logger log = Logger.getGlobal();

    private static void message(Actor actor, String message) {
        System.out.println(String.format("%s %s %s", actor.getClass().getSimpleName(), actor.getName(), message));
    }

    public void beginning(Actor actor) {
        message(actor, "enters the game");
    }

    public void meetZoe(Actor actor) {
        message(actor, "meets a zombie!");

        Zombie zoe = new Zombie("Zoe");

        message(zoe, "attacks");
        zoe.fight(actor);
    }

    public void magicRoom(Actor actor) {
        message(actor, "enters a strange room");

        // only a warrior could become a mystic warrior
        if (actor instanceof Warrior) {
            log.info("Decorating Warrior");
            MysticWarrior mw = new MysticWarrior((Warrior) actor);
            mw.heal();
            message(actor, "feels better");
        } else {
            System.out.println("Nothing interesting here");
        }
    }
}
