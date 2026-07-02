package JavaBasics;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		if(age > 56) {
			System.out.println("You are Experiensed.");
		}
		else if (age > 46) {
			System.out.println("You are Semi-Experiensed.");
		}
		else if (age > 36) {
			System.out.println("You are Semi-Semi-Experiensed.");
		}	
		else if (age < 36) {
			System.out.println("You are not yet much Experiensed.");
		}
	}

}
