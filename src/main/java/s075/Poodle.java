package s075;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;
	
	public Poodle() {
		super();
		this.curlDensity = DEFAULT_DENSITY;
	}

	public Poodle(String name) {
		super(name);
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight);
		this.curlDensity = curlDensity;
	}
	
	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}
	
	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
