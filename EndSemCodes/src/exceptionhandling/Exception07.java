package exceptionhandling;

//Exception handling using THROW keyword.

public class Exception07 {
	public static void main(String[] args) {
		
		int age = 15;
		
		if(age < 18) {
			throw new ArithmeticException("No Eligible for Voting.");
		}
		
		System.out.println("Eligiable for voting.");
	}

}
