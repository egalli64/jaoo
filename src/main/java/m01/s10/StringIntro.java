package m01.s10;

public class StringIntro {
    public static void main(String[] args) {
        // a single character
        char c = 'x';
        System.out.println(c);

        // Create a String explicitly, !!! _not_ a good idea !!!
        String s = new String("Hello");
        System.out.println(s);

        // Implicit call to "new" for a String
        String t = "Hello";
        System.out.println(t);

        // Create a mutable string, and then change it
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Tom");

        // Create a String from a StringBuilder
        String u = sb.toString();
        System.out.println(u);
    }
}
