package exceptionhandling;

// multiple catch block.

public class Exception03 {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]); // Error
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error " + e);
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot Divide By Zero " + e);
        }

        System.out.println("Program Finished");
    }
}
