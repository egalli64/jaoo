package m11.s11;

import java.util.Random;
import java.util.logging.Logger;

public class Actor {
    private static final Logger log = Logger.getGlobal();

    private static final int BASE_VALUE = 10;
    private static final int MAX_EXTRA = 90;

    private static final Random random = new Random();

    private static int randomValue() {
        return BASE_VALUE + random.nextInt(MAX_EXTRA);
    }

    private String name;
    private int life;
    protected int strength;

    public Actor(String name) {
        this(name, randomValue());
    }

    public Actor(String name, int life) {
        this(name, life, randomValue());
    }

    public Actor(String name, int life, int strength) {
        this.name = name;
        this.life = life;
        this.strength = strength;

        log.info(String.format("%s %s [%d, %d]", getClass().getSimpleName(), name, life, strength));
    }

    public String getName() {
        return name;
    }

    /**
     * A life damage is inflicted to this actor
     * 
     * @param damage points to be cut out
     * @return true if still alive
     */
    public boolean wound(int damage) {
        this.life -= damage;
        return this.life > 0;
    }

    public void addLife(int points) {
        if (points < 0) {
            log.warning("Unexpected negative input");
            return;
        }

        this.life += points;
        if (this.life > BASE_VALUE + MAX_EXTRA) {
            log.warning("Life reached its max value");
            this.life = BASE_VALUE + MAX_EXTRA;
        } else {
            log.info("Healing worked just fine");
        }
    }
}
