package JavaBasics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		switch(age) {
		case 18:
			System.out.println("You are going to be an adult.");
			break;
		case 21:
			System.out.println("You are an adult.");
			break;
		case 32:
			System.out.println("You are kind of experienced adult.");
			break;
		case 60:
			System.out.println("You must enjoy your life.");
			break;
		default:
			System.out.println("Your age is not considered.");
			
		}
		
		System.out.println("Thanks for using my program.");
	}

}
