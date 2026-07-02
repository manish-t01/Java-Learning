package exceptionhandling;

// nested try.

public class Exception05 {
	public static void main(String[] args) {
		
	try {
		
		try {
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println(result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Error " + e);
		}
		
	}
	
	catch(Exception e) {
		System.out.println("General Error " + e);
	}
	
	
  }
}


