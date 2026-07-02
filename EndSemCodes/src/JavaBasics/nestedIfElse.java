package JavaBasics;

public class nestedIfElse {
	public static void main(String[] args) {

        int age = 15;
        int marks = 32;

        if (age >= 18) {

            if (marks >= 50) {
                System.out.println("Eligible");
            } else {
                System.out.println("Marks too low");
            }

        } else {
            System.out.println("Too young");
        }
    }

}
