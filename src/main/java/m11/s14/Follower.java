package m11.s14;

public class Follower implements Subscriber {
    private String name;
    private Publisher publisher;

    public Follower(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public void update(String blog, String title) {
        System.out.println(String.format("%s: Blog '%s' has a new post titled '%s'", name, blog, title));
    }

    @Override
    public void leave() {
        publisher.remove(this);
    }
}