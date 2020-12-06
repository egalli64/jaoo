package m02.s02;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        int result = value;
        System.out.println("result = value: value is " + value + ", result is " + result);

        result = ++value;
        System.out.println("result = ++value: value is " + value + ", result is " + result);

        result = --value;
        System.out.println("result = --value: value is " + value + ", result is " + result);

        result = value++;
        System.out.println("result = value++: value is " + value + ", result is " + result);

        result = value--;
        System.out.println("result = value--: value is " + value + ", result is " + result);

        result = +value;
        System.out.println("result = +value: value is " + value + ", result is " + result);

        result = -value;
        System.out.println("result = -value: value is " + value + ", result is " + result);
    }
}
