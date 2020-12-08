package m06.s12;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class ConcreteClass extends AbstractClass {
    @Override
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}
