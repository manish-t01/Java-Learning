package abstractClass;

abstract class Shape {

    abstract void draw();

}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing circle");
    }

}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing rectangle");
    }

}
public class Abs02 {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        r.draw();

    }

}
