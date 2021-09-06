package m08.s02;

import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        date.setTime(date.getTime() - 1_000_000_000);
        System.out.println("Moving back one billion ms: " + date);

        System.out.println("Nine hundred billion ms in the UNIX epoch: " + new Date(900_000_000_000L));
    }
}
