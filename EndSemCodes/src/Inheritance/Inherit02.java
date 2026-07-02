package Inheritance;

//Example 2 – Parent variable + method
class Animal1 {
    String name = "Animal";

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {

}

public class Inherit02 {
    public static void main(String[] args) {

        Dog1 d = new Dog1();

        System.out.println(d.name);
        d.eat();
    }
}
