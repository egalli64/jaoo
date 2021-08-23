package m12.s10;

import java.util.logging.Logger;

public class CompositeMain {
    private static final Logger log = Logger.getGlobal();

    public static void main(String args[]) {
        // 1
        Playlist music = new Playlist("Music");
        Track one = new Track("Noise", "The Unqualified");
        music.add(one);
        music.add(new Track("Something else", "The Plain Players"));
        log.info(music.toString());
        music.add(new Track("Sleeping late", "Dr. Hook"));
        music.remove(one);
        log.info(music.toString());

        // 2
        Playlist words = new Playlist("Hard to understand");
        words.add(new Track("Nachrichten", "Deutsche Welle"));
        words.add(new Track("Advanced OO Design Features", "A Random Guy"));
        words.setSpeed(0.75);
        log.info(words.toString());

        // 3
        Playlist my = new Playlist("My Playlist");
        log.info("My empty playlist " + my.toString());

        my.add(words);
        my.add(music);
        Track anotherSong = new Track("Slow and Boring", "The Plain Players");
        anotherSong.setSpeed(1.25);
        my.add(anotherSong);

        System.out.println("Playing my playlist");
        my.play();
    }
}