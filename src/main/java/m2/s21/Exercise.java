package m2.s21;

public class Exercise {
    final static int GAP = 'a' - 'A';
    final static int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
//        exercise("Bob");
//        exercise("ciAo");
//
//        System.out.println("toUpper(): " + toUpper("Bob"));
//        System.out.println("toUpper2(): " + toUpper2("Bob"));
//        System.out.println("toUpper3(): " + toUpper3("Bob"));
//        System.out.println("toUpper4(): " + toUpper4("Bob"));

        System.out.println("encryptCaesar1(): " + encryptCaesar1("CIAO ciao CIAO"));
        System.out.println("encryptCaesar1(): " + encryptCaesar1(""));
        System.out.println("encryptCaesar1(): " + encryptCaesar1(null));
        System.out.println("encryptCaesar1(): " + encryptCaesar1("CIAO"));
        System.out.println("encryptCaesar1(): " + encryptCaesar1("ZOO"));

        System.out.println("encryptCaesar() CIAO +1: " + encryptCaesar("CIAO", 1));
        System.out.println("encryptCaesar(): ZOO +1: " + encryptCaesar("ZOO", 1));
        System.out.println("encryptCaesar(): DJBP -1: " + encryptCaesar("DJBP", -1));
        System.out.println("encryptCaesar(): APP -1: " + encryptCaesar("APP", -1));

        System.out.println("encryptCaesar(): CIAO +26: " + encryptCaesar("CIAO", 26));
        System.out.println("encryptCaesar(): ZOO +26: " + encryptCaesar("ZOO", 26));
        System.out.println("encryptCaesar(): DJBP -26: " + encryptCaesar("DJBP", -26));
        System.out.println("encryptCaesar(): APP -26: " + encryptCaesar("APP", -26));

        System.out.println("encryptCaesar(): CIAO +27: " + encryptCaesar("CIAO", 27));
        System.out.println("encryptCaesar(): ZOO +27: " + encryptCaesar("ZOO", 27));
        System.out.println("encryptCaesar(): DJBP -27: " + encryptCaesar("DJBP", -27));
        System.out.println("encryptCaesar(): APP -27: " + encryptCaesar("APP", -27));
    }

    /**
     * Caesar Algorithm (full version)
     * 
     * <pre>
     * shift == 1
     *      CIAO -> DJBP
     *      ZOO -> APP
     * shift == -1
     *      DJBP -> CIAO
     *      APP -> ZOO
     * </pre>
     * 
     * @param s     an uppercase-only string (?!)
     * @param shift the encryption gap
     * @return the encrypted version of the input string
     */
    public static String encryptCaesar(String s, int shift) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current >= 'A' && current <= 'Z') {
                int delta = (current - 'A' + shift) % ALPHABET_SIZE;
                if (delta < 0) {
                    delta += ALPHABET_SIZE;
                }
                result.append((char) ('A' + delta));
            }
        }

        return result.toString();
    }

    /**
     * Caesar Algorithm (+1 version)
     * 
     * <pre>
     * CIAO -> DJBP
     * ZOO -> APP
     * </pre>
     * 
     * @param s an uppercase-only string (?!)
     * @return the encrypted version of the input string
     */
    public static String encryptCaesar1(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'A' && cur < 'Z') {
                sb.append(++cur);
            } else if (cur == 'Z') {
                sb.append('A');
            }
        }

        return sb.toString();
    }

    public static String toUpper(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.append((char) (cur - GAP));
            } else {
                sb.append(cur);
            }
        }

        return sb.toString();
    }

    public static String toUpper2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char cur = sb.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.setCharAt(i, (char) (cur - GAP));
            }
        }

        return sb.toString();
    }

    public static String toUpper3(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.insert(i, (char) (cur - GAP));
            } else {
                sb.insert(i, cur);
            }
        }

        return sb.toString();
    }

    public static String toUpper4(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                String x = Character.toString((char) (cur - GAP));
                sb.replace(i, i + 1, x);
            }
        }

        return sb.toString();
    }

    public static void exercise(String sample) {
        if (sample == null || sample.isEmpty()) {
            return;
        }

        System.out.println(sample + " to uppercase and lowercase");
        for (int i = 0; i < sample.length(); i++) { // scope
            char cur = sample.charAt(i);

            if (cur >= 'a' && cur <= 'z') {
                System.out.print((char) (cur - GAP));
            } else {
                System.out.print(cur);
            }
        } // DRY

        System.out.print(", ");

        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'A' && cur <= 'Z') {
                System.out.print((char) (cur + GAP));
            } else {
                System.out.print(cur);
            }
        }

        System.out.println();
    }
}
