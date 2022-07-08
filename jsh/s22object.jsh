class Pet {
    private String name;
    private double weight;

    public Pet(String name) {
        this.name = name;
        this.weight = 5.0;
    }

    public void eat() {
        weight += 0.1;
        System.out.println(name + " is eating, now is weight is " + weight);
    }
}

Pet bob = new Pet("Bob");
bob.eat();
