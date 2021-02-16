package m11.s14;

import java.util.HashSet;
import java.util.Set;

public class Blog implements Publisher {
    private Set<Subscriber> observers;
    private String name;
    private String currentPostTitle;

    public Blog(String name) {
        this.name = name;
        this.observers = new HashSet<>();
        this.currentPostTitle = "none";
    }

    @Override
    public void register(Subscriber observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Subscriber observer) {
        observers.remove(observer);
    }

    public void addPost(String title) {
        this.currentPostTitle = title;

        for (Subscriber observer : observers) {
            observer.update(name, currentPostTitle);
        }
    }
}