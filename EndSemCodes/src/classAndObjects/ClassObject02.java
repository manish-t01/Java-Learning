package classAndObjects;

//More than one class.
class Car2 {
    String color;
    String brand;
}

public class ClassObject02 {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        c1.color = "Red";
        c1.brand = "Honda";

        Car2 c2 = new Car2();
        c2.color = "Blue";
        c2.brand = "Tata";

        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}