package s056;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract {
    @Override
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}
