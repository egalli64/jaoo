package m3.s22;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;
	}

	public static void main(String[] args) {
		Simple simple = new Simple();

		try {
			int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
			System.out.println("Negate " + value);
			int x = simple.negate2(value);
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

class MyNegateException extends Exception {
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() {
		return alternativeValue;
	}
}
