package methodsInJava;

//Different data type
public class MethodOverloading09 {

	    public static void show(int a) {
	        System.out.println(a);
	    }

	    public static void show(String name) {
	        System.out.println(name);
	    }

	    public static void main(String[] args) {

	        show(10);

	        show("Manish");
	    }
	}
