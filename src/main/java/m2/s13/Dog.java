package m2.s13;

public class Dog implements BarkAndWag {
    private final int WAG_COUNT;

    public Dog(int wagCount) {
        WAG_COUNT = wagCount;
    }

    public Dog() {
        WAG_COUNT = DEFAULT_WAG_COUNT;
    }

    @Override
    public String bark() {
        return "Woof";
    }

    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public String wag() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < WAG_COUNT; i++) {
            sb.append("Wag");
        }

        return sb.toString();
    }
}