package methodsInJava;

import java.util.Scanner;

class Method06 {
    
	//static void square(int n) THIS ASLO WORKS.
    public static void Square(int n) {
        System.out.println("Square of " + n + " is " + n * n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = sc.nextInt();

        Square(num);
    }
}
