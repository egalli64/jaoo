package m2.s03.ex;

public class Cat {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void meow() {
        String greet = String.format("Meow! I'm %s, a %s cat.", name, color);
        System.out.println(greet);
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
}
