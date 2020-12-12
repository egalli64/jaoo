package m07.s06;

public class Main {

    public static void main(String[] args) {
        Simple simple = new Simple();

        try {
            int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
            System.out.println("Negate " + value);
            int x = simple.negateFallback(value);
            System.out.println("My value negated is: " + x);
        } catch (NumberFormatException e) {
            System.out.println("Pass me an integer!");
            return;
        } catch (MyNegateException mne) {
            System.out.println("My value negated is close to: " + mne.getAlternativeValue());
            return;
        }
    }
}
