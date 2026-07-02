package loopsInJava;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to run the loop: ");
		int num = sc.nextInt();
		int i;
		
		for(i=1; i<=num; i++) {
			System.out.println(i);
		}
	}

}
