package m06.s07;

public class Dog {
    // Cannot reduce visibility
//    @Override
//    protected String toString() {
//        return "A dog";
//    }

    @Override
    public String toString() {
        return "A dog";
    }

    // covariant return type
    @Override
    protected Dog clone() {
        return new Dog();
    }

    // Cannot override final
//    public void notify() {
//    }

    // this is an overload
    public String toString(boolean flag) {
        return "A dog, flagged as " + flag;
    }

}
