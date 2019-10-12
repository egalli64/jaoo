package s043;

public class SwitchEnum {

    public static void main(String[] args) {
        WeekendDay day = WeekendDay.SATURDAY;

        // ...

        switch (day) {
        case SATURDAY:
            System.out.println("No alarm clock today");
            break;
        case SUNDAY:
            System.out.println("Ready for a new week?");
            break;
        }
    }
}