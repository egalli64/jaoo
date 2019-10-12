package s043;

public class SwitchString {
    public static void main(String[] args) {
        String value = "1";

        // ...

        switch (value) {
        case "1":
            System.out.println("value is one");
            break;
        case "2":
            System.out.println("value is two");
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
    }
}
