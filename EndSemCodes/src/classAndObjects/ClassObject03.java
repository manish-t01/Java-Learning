package classAndObjects;

//Class with method.
class Car3 {
    String color;

    public void drive() { //Here we can also write "public void drive()
        System.out.println("Car is moving");
    }
}

public class ClassObject03 {
    public static void main(String[] args) {

        Car3 c1 = new Car3();

        c1.color = "Red";

        System.out.println(c1.color);
        c1.drive();
    }
}
