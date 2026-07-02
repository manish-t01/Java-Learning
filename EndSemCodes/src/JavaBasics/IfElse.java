 package JavaBasics;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	System.out.println("Enter Your Age: ");
	int age = sc.nextInt();
	
	if(age >= 18) {
	    System.out.println("You are aligiable for Driving Licence.");
	}else {
		System.out.println("You are not aligiable fro Driving Licence.");
	}
	
  }
}