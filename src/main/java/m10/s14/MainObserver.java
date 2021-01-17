package m10.s14;

public class MainObserver {
    public static void main(String[] args) {
        Blog blog = new Blog("Fun with Java");

        blog.register(new Follower("Tom"));
        blog.register(new Follower("Bob"));

        blog.addPost("Looping forever");
    }
}
