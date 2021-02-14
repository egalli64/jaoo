package m06.s14.other;

public class Poodle extends Dog {
    private static final int DEFAULT_DENSITY = 3;
    private static final String DEFAULT_NAME = "!!!";
    private static final int DEFAULT_WEIGHT = 5;
    private int curlDensity; // = 0

    public Poodle() {
        this(DEFAULT_NAME);
    }

    public Poodle(String name) {
        this(name, DEFAULT_WEIGHT);
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
