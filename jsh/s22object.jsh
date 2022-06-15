class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

Pet pet = new Pet("Bob");
pet.eat();
