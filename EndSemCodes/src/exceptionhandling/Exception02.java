package exceptionhandling;

//try and catch block.

public class Exception02 {
	public static void main(String[] args) {
		try {
			int []arr = {10, 20, 30};
			System.out.println(arr[5]);
		}
		
		catch(Exception e) {
			System.out.println("There is no value available at index 5" + e);
		}
	}

}
