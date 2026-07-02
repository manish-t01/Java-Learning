package exceptionhandling;
import java.io.IOException;

public class Throws11 {

    static void test() throws IOException, ArithmeticException {

        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }

    public static void main(String[] args) {

        try {
            test();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
