package methodsInJava;

public class MthodOverloading10 {
	
	    static void greet() {
	        System.out.println("Hello");
	    }

	    static void greet(String name) {
	        System.out.println(name);
	    }

	    public static void main(String[] args) {

	        greet();

	        greet("Manish");
	    }
	}
