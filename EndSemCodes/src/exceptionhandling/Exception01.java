package exceptionhandling;

// try and catch block.

public class Exception01 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        }
    }
}
