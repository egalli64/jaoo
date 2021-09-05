package m13.s10;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Playlist implements Composite {
    private static final Logger log = Logger.getGlobal();

    public String name;
    public List<Composite> tracks = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        log.info("Playing playlist " + name);
        for (Composite composite : tracks) {
            composite.play();
        }
    }

    @Override
    public void setSpeed(double speed) {
        log.info(String.format("Changing speed for %s to %.2f", name, speed));
        for (Composite composite : tracks) {
            composite.setSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(Composite component) {
        tracks.add(component);
    }

    public void remove(Composite component) {
        tracks.remove(component);
    }

    @Override
    public String toString() {
        return name + ": " + tracks;
    }
}