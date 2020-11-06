package m1.s17;

public class SwitchDays {
    public static void main(String[] args) {
        WeekDay today = WeekDay.FRIDAY;

        switch (today) {
        case MONDAY:
            System.out.println("Chinese");
            break;
        case TUESDAY:
            System.out.println("Hamburger");
            break;
        case WEDNESDAY:
            System.out.println("Pasta");
            break;
        case THURSDAY:
            System.out.println("Fish and Chips");
            break;
        case FRIDAY:
            System.out.println("Pizza");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Something else");
            break;
        }

        if (today == WeekDay.FRIDAY) {
            System.out.println(":-)");
        }

        for (WeekDay day : WeekDay.values()) {
            System.out.println("What we can do on " + day + "?");
        }
    }
}
