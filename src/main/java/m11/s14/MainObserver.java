package m11.s14;

public class MainObserver {
    public static void main(String[] args) {
        Blog blog = new Blog("Fun with Java");

        Follower tom = new Follower("Tom", blog);
        blog.register(tom);

        Follower bob = new Follower("Bob", blog);
        blog.register(bob);

        blog.addPost("Looping forever");

        Follower kim = new Follower("Kim", blog);
        blog.register(kim);
        tom.leave();
        blog.remove(bob);

        blog.addPost("Switch on strings");

    }
}
