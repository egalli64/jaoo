package m11.s14;

public interface Publisher {
    void register(Subscriber observer);

    void remove(Subscriber observer);
}