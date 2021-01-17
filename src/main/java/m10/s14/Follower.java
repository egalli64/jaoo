package m10.s14;

public class Follower implements Subscriber {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String blog, String title) {
        System.out.println(String.format("%s: Blog '%s' has a new post titled '%s'", name, blog, title));
    }
}