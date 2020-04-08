package m1.s31;

public class SwitchInt {
    public static void main(String[] args) {
        int value = 1;

        // ...

        switch (value) {
        case 1:
        case 3:
        case 5:
            System.out.println("value is odd and small");
            break;
        case 2:
        case 4:
        case 6:
            System.out.println("value is even and small");
            break;
        default:
            System.out.println("value is something else");
            break;
        }

        System.out.println("done");
    }
}
