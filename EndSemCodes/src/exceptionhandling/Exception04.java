package exceptionhandling;

// Multiple catch block.

public class Exception04 {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error " + e);
        }

        catch(ArithmeticException e) {
            System.out.println("Math Error " + e);
        }

        System.out.println("Program Finished");
    }
}
