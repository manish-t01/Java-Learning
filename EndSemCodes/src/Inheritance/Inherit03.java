package Inheritance;

//Example 3 – Child has its own method
class Animal2 {
    void eat() {
        System.out.println("Animal is Eating...");
    }
}

class Dog2 extends Animal2 {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inherit03 {
    public static void main(String[] args) {

        Dog2 d = new Dog2();

        d.eat();
        d.bark();
    }
}
