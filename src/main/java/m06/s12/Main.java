package m06.s12;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        AbstractClass ma = new AbstractClass();
//        AbstractTwo max = new AbstractTwo();

        AbstractClass ac = new ConcreteClass();
        ac.anAbstractMethod();

        AbstractTwo at = new ConcreteTwo();
        at.aConcreteMethod();
    }
}
