package m12.s10;

import java.util.logging.Logger;

public class Track implements Composite {
    private static final Logger log = Logger.getGlobal();

    private static final double DEFAULT_SPEED = 1;

    private String name;
    private String author;
    private double speed;

    public Track(String name, String author) {
        this(name, author, DEFAULT_SPEED);
    }

    public Track(String name, String author, double speed) {
        this.name = name;
        this.author = author;
        this.speed = speed;
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