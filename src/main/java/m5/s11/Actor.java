package m5.s11;

import java.util.logging.Logger;

public class Actor {
    private static final Logger LOG = Logger.getGlobal();

    private static final int BASE_VALUE = 10;
    private static final int MAX_EXTRA = 90;

    static private int randomValue() {
        return BASE_VALUE + (int) (Math.random() * MAX_EXTRA);
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

        LOG.info(String.format("%s %s [%d, %d]", getClass().getSimpleName(), name, life, strength));
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
        if(points < 0) {
            LOG.warning("Unexpected negative input");
            return;
        }
        
        this.life += points;
        if(this.life > BASE_VALUE + MAX_EXTRA) {
            LOG.warning("Life reached its max value");
            this.life = BASE_VALUE + MAX_EXTRA;
        } else {
            LOG.info("Healing worked just fine");
        }
    }
}
