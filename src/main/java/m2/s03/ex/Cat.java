package m2.s03.ex;

public class Cat {
    private static int count = 0;

    private String name;
    private String color;
    private int age;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 5;

        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public void meow() {
        String greet = String.format("Meow! I'm %s, a %s cat.", name, color);
        System.out.println(greet);
    }

    public void meow(String word) {
        String greet = String.format("%s! I'm %s, a %s cat.", word, name, color);
        System.out.println(greet);
    }

    public void meow(int count) {
        for (int i = 0; i < count; i++) {
            meow();
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
