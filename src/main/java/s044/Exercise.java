package s044;

public class Exercise {
    public static void main(String[] args) {
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
