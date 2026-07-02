package exceptionhandling;

public class Throws10 {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Not eligible to vote");
        }

        System.out.println("You can vote.");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}