package m2.s32;

public class Exercise {
    public static void main(String[] args) {
        // counting
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int counter = 0;
        while (counter < 10) {
            System.out.print(counter + " ");
        }
        System.out.println();

        // for each
        boolean[] flags = { true, false, false };

        System.out.println("*** Initial Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }

        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                flags[i] = true;
            }
        }

        System.out.println("*** Changed Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }

        for (boolean flag : flags) {
            if (!flag) {
                flag = true;
            }
        }

        System.out.println("*** (Not!) Changed Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }
    }
}
