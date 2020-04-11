package m3.s05;

public class Wrapper {
    public static void main(String[] args) {
        System.out.println(Boolean.class);
        System.out.println(Character.class);
        System.out.println(Byte.class);
        System.out.println(Short.class);
        System.out.println(Integer.class);
        System.out.println(Float.class);
        System.out.println(Double.class);

        // from Java 9 on
        @SuppressWarnings("deprecation")
        Integer i = new Integer(1);
        Integer j = Integer.valueOf(2);
        System.out.println(i + j);

        int k = j.intValue();
        System.out.println(k);

        Integer m = 3;
        System.out.println(m);

        int n = j;
        System.out.println(n);
    }
}
