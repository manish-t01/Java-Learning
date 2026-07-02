package exceptionhandling;

// Exception propgation.

public class Exception08 {

    static void method3() {
        int result = 10 / 0; // Exception occurs
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {

        try {
            method1();
        }

        catch(ArithmeticException e) {
            System.out.println("Exception Handled in Main Method " + e);
        }
    }
}