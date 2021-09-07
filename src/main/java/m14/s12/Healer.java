package m14.s12;

public interface Healer {
    /**
     * Increase target status, when possible
     * 
     * @param target
     */
    void heal(Actor target);
}
