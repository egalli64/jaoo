package m02.s02;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        int result = value;
        System.out.print("result = value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = ++value;
        // same as:
//      value = value + 1;
//      result = value;
        System.out.print("result = ++value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = --value;
        System.out.print("result = --value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = value++;
        // same as:
//      result = value;
//      value = value + 1;
        System.out.print("result = value++: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = value--;
        System.out.print("result = value--: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = +value;
        System.out.print("result = +value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = -value;
        System.out.print("result = -value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);
    }
}
