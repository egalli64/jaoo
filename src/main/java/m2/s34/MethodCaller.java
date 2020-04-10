package m2.s34;

public class MethodCaller {
    public static void main(String[] args) {
        System.out.println(Simple.h());
        
        Simple reference = new Simple();
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
