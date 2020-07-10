package m2.s15;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete();
        ma.anAbstractMethod();

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
