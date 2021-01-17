package m10.s09;

import java.util.logging.Logger;

public class Track implements Composite {
    private static final Logger log = Logger.getGlobal();

    private static double DEFAULT_SPEED = 1;

    public String name;
    public String author;
    public double speed = DEFAULT_SPEED;

    public Track(String name, String author) {
        this(name, author, DEFAULT_SPEED);
    }

    public Track(String name, String author, double speed) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void play() {
        log.info(String.format("Playing %s by %s at speed %.2f", name, author, speed));
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("[%s by %s (%.2f)]", name, author, speed);
    }
}