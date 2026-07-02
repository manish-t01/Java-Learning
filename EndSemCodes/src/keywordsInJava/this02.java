package keywordsInJava;

class Car {

    String color;

    void setColor(String color) {
        this.color = color;
    }

    void show() {
        System.out.println(color);
    }
}

public class this02{
    public static void main(String[] args) {
        Car c = new Car();

        c.setColor("Red");

        c.show();
    }
}
