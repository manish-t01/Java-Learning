package loopsInJava;

import java.util.Scanner;

public class ContinueInLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to run the loop: ");
		int num = sc.nextInt();
		int i;
		
		for(i=1; i<=num; i++) {
			if(i==2) {
				System.out.println("This is continue in loop.");
				continue;
			}
			
			System.out.println(i);
			System.out.println("Java is great.");
		}
	}

}
