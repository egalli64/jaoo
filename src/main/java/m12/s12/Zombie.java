package m12.s12;

import java.util.logging.Logger;

public class Zombie extends Actor implements Fighter {
    private static final Logger log = Logger.getGlobal();

    public Zombie(String name) {
        super(name);
    }

    @Override
    public boolean fight(Actor other) {
        log.info(String.format("%s %s wins this round of fight", getClass().getSimpleName(), getName()));
        other.wound(1);
        return true;
    }

}
