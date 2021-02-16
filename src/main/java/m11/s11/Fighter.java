package m11.s11;

public interface Fighter {
    /**
     * Fight again another actor
     * 
     * @param other the enemy
     * @return true if win 
     */
    boolean fight(Actor other);
}
