package classAndObjects;

//Create Object.
class Car {
    String color;
    String brand;
}

public class ClassObject01 {
	    public static void main(String[] args) {

	        Car c1 = new Car();

	        c1.color = "Red";
	        c1.brand = "Honda";

	        System.out.println(c1.color);
	        System.out.println(c1.brand);
	    }
	}