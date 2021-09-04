package m08.s02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        date.setTime(date.getTime() - 1_000_000_000);
        System.out.println("Moving back one billion ms: " + date);

        System.out.println("Nine hundred billion ms after begin of UNIX time: " + new Date(900_000_000_000L));
    }
}
