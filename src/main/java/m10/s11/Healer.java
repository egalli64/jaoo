package m10.s11;

public interface Healer {
    /**
     * Increase target status, when possible
     * 
     * @param target
     */
    void heal(Actor target);
}
